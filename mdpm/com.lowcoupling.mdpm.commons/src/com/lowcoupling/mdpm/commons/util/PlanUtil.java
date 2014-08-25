package com.lowcoupling.mdpm.commons.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.joda.time.DateTime;
import org.joda.time.Interval;

import com.lowcoupling.mdpm.lng.plan.plan.Activity;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.CheckPoint;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.plan.ResourceInvolvement;
import com.lowcoupling.mdpm.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.mdpm.lng.plan.util.ActivityGroupDecorator;
import com.lowcoupling.mdpm.lng.resources.resources.Resource;


public class PlanUtil {

	private static PlanUtil instance;
	private PlanUtil(){

	}
	public static PlanUtil getInstance () {
		if (instance==null){
			instance = new PlanUtil();
		}
		return instance;
	}


	/*
	 * it returns a Collection of plans on which the plan passed as parameter depends 
	 */
	public Collection<Project> getRelatedPlans(Project plan){

		Iterator<ActivityElement> activities = plan.getActivities().iterator();
		LinkedHashMap<String, Project> relatedPlans = new LinkedHashMap<String,Project>();
		//System.out.println("Retrieving plans for "+plan.getName());
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if(!element.getDependencies().isEmpty()){
				Iterator<ActivityElement> dependencies = element.getDependencies().iterator();
				while(dependencies.hasNext()){
					ActivityElement dependency = dependencies.next();
					EObject container = dependency.eContainer();
					while (!(container instanceof Project)){
						container = container.eContainer();
					}
					if (container instanceof Project){
						relatedPlans.put(((Project)container).getName(), ((Project)container));
					}
				}
			}
		}
		relatedPlans.put(plan.getName(),plan); 
		//System.out.println(" >returning plans");
		return relatedPlans.values();

	}

	/*
	 * It provides as output ALL the activities encompassing those belonging to 
	 * plans on which the current plan depends. These are retrieved 
	 * throuth the getRelatedPlans method
	 */
	public Map<String, ActivityElement> getAllActivities(Project plan, boolean dependencies){

		Collection<Project> plans = getRelatedPlans(plan);
		Iterator<Project> planIt = plans.iterator();
		Collection<ActivityElement> activities = new ArrayList<ActivityElement>();
		if (dependencies){
			while(planIt.hasNext()){
				Project cp = planIt.next();
				activities.addAll(cp.getActivities());
			}
		}else{
			activities = plan.getActivities();
		}
		Iterator<ActivityElement> actIt = activities.iterator();
		LinkedHashMap<String, ActivityElement> activityElements = new LinkedHashMap<String,ActivityElement>();
		while( actIt.hasNext()){
			ActivityElement element = (ActivityElement) actIt.next();
			if(element instanceof Activity || element instanceof CheckPoint){
				activityElements.put((new ActivityElementDecorator(element)).getFullQualifiedName(), element);
			}else if( element instanceof ActivityGroup){
				//activityElements.put(getFullQualifiedName(element), element);
				activityElements.putAll( (new ActivityGroupDecorator((ActivityGroup)element)).getAllActivities() );
			}

		}
		return activityElements;
	}





	public Map<String, Resource> getInvolvedResources(Program plans, boolean dependencies){
		LinkedHashMap<String, Resource> resources = new LinkedHashMap<String,Resource>();
		Iterator<Project> planIterator = plans.getProjects().iterator();
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			resources.putAll(PlanUtil.getInstance().getInvolvedResources(plan, dependencies));
		}
		return resources;
	}

	/*
	 * Returns a map containing all the resources involved by a Project!
	 * The set of resources does not encompass those involved in other plans 
	 * on which the current plan depends
	 */
	public Map<String, Resource> getInvolvedResources(Project plan, boolean dependencies){
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
		LinkedHashMap<String, Resource> resources = new LinkedHashMap<String,Resource>();
		while(activities.hasNext()){
			ActivityElement el = (ActivityElement)activities.next();
			if(el instanceof Activity){
				Activity  activity = (Activity) el;
				Iterator<ResourceInvolvement> tmpit = activity.getInvolvedResources().iterator();
				while(tmpit.hasNext()){
					ResourceInvolvement res = tmpit.next();
					resources.put(res.getResource().getName(), res.getResource());
				}
			}
		}

		return resources;
	}



	/*
	 * it returns the Project containing the ActivityElement passed as parameter
	 */
	public Project getPlan(ActivityElement element){
		EObject container = element.eContainer();
		String qualifiedName=element.getName();;
		while ( !(container instanceof Project) && (container !=null)){
			if(container instanceof ActivityGroup){
				qualifiedName= ((ActivityGroup)container).getName()+"."+qualifiedName;
			}
			container = container.eContainer();
		}
		if (container instanceof Project){
			return (Project)container;
		}else{
			return null;
		}
	}



	public Activity getFirstActivity(Program plans, boolean dependencies){
		Iterator<Project> planIterator = plans.getProjects().iterator();
		Activity first = null;
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getFirstActivity(plan, dependencies);
			if (current!=null){
				if (first !=null){
					ActivityElementDecorator firstActivity = new ActivityElementDecorator(first);
					ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
					if(currentActivity.getStartByCalendar().before(firstActivity.getStartByCalendar())){
						first=current;
					}
				}else{
					first = current;
				}
			}else{
				continue;
			}
		}
		return first;
	}

	public Activity getFirstActivity(Collection<Project> plans, boolean dependencies){
		Iterator<Project> planIterator = plans.iterator();
		Activity first = null;
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getFirstActivity(plan, dependencies);
			if (first !=null){
				ActivityElementDecorator firstActivity = new ActivityElementDecorator(first);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(currentActivity.getStartByCalendar().before(firstActivity.getStartByCalendar())){
					first=current;
				}
			}else{
				first = current;
			}

		}
		return first;
	}

	public Activity getLastActivity(Program plans, boolean dependencies){
		Iterator<Project> planIterator = plans.getProjects().iterator();
		Activity last = null;

		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getLastActivity(plan, dependencies);
			if (last !=null){
				ActivityElementDecorator lastActivity = new ActivityElementDecorator(last);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(lastActivity.getEndByCalendar().before(currentActivity.getEndByCalendar())){
					last=current;
					//System.out.println("\t last activity updated with "+current);	
				}
			}else{
				//System.out.println("\t last Activity was null now initialized with "+current);
				last = current;
			}

		}
		return last;
	}

	public Activity getLastActivity(Collection<Project> plans, boolean dependencies){
		Iterator<Project> planIterator = plans.iterator();
		Activity last = null;

		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getLastActivity(plan, dependencies);
			if (last !=null){
				ActivityElementDecorator lastActivity = new ActivityElementDecorator(last);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(lastActivity.getEndByCalendar().before(currentActivity.getEndByCalendar())){
					last=current;
					//System.out.println("\t last activity updated with "+current);	
				}
			}else{
				//System.out.println("\t last Activity was null now initialized with "+current);
				last = current;
			}

		}
		return last;
	}



	//returns the first activity (to begin) of the plan passed as parameter
	//Also dependencies shall be taken into account
	public Activity getFirstActivity(Project plan, boolean dependencies){
		//Calendar calendar = GregorianCalendar.getInstance();
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
		ActivityElementDecorator first = null;
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if (element instanceof Activity){
				Activity act = (Activity)element;
				ActivityElementDecorator activity = new ActivityElementDecorator(act);
				if (first!=null){
					if( (activity.getStartByCalendar()!=null)){
						if(first.getStartByCalendar()!=null){
							if(activity.getStartByCalendar().before(first.getStart())){
								first = activity;
							}
						}else{
							first = activity;
						}
					}

				}else{
					first = activity;
				}
			}
		}
		if (first!=null ){
			return (Activity)first.getActivityElement();
		}else{
			System.out.println("First activity is null!");
			return null;
		}
	}



	//returns the last activity (to end) of the plan passed as parameter
	//Also dependencies shall be taken into account
	public Activity getLastActivity(Project plan, boolean dependencies){
		//Calendar calendar = GregorianCalendar.getInstance();
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
		ActivityElementDecorator  last = null;
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if (element instanceof Activity){
				Activity act = (Activity)element;
				ActivityElementDecorator activity = new ActivityElementDecorator(act);
				if (last!=null){
					if(last.getEndByCalendar().before(activity.getEndByCalendar())){
						last = activity;
					}
				}else{
					last = activity;
				}
			}
		}
		return (Activity)last.getActivityElement();
	}


	public double getOccupationByPeriod(Resource res, Program plans,  Interval period){
		Iterator<Project> planIterator = plans.getProjects().iterator();
		//Activity last = null;
		double occupation = 0;
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			occupation += getOccupationByPeriod(res,plan,period, false);
		}
		return occupation;
	}
	public double getOccupationByPeriod(Resource res, Project plan,  Interval period, boolean dependencies){
		//Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans(plan);
		//Iterator<Project> planIterator = plans.iterator();
		double occupation=0;
		int dayCount=0;
		//for each plan
		//System.out.println("occupation of "+res.getName()+ "from "+period.getStart().toString()+" to "+period.getEnd().toString());
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
		//for each activity
		while(activities.hasNext()){
			ActivityElement act = activities.next();
			if(act instanceof Activity){
				ActivityElementDecorator activity = new ActivityElementDecorator((Activity)act);
				DateTime start = new DateTime(activity.getStartByCalendar());
				DateTime end = new DateTime(activity.getEndByCalendar());
				Interval interval = new Interval(start,end);
				//if the activity involves the desired resource
				Iterator<ResourceInvolvement> involvements = ((Activity)act).getInvolvedResources().iterator();
				ResourceInvolvement involvement = null;
				while(involvements.hasNext()){
					ResourceInvolvement inv = involvements.next();
					if (inv.getResource().getName().equals(res.getName())){
						involvement = inv;
						break;
					}
				}
				if(involvement!=null){
					//for each day of the desired period
					//activity.getInvolvedResources().
					DateTime current = period.getStart().plusMillis(1);
					DateTime endPeriod = period.getEnd();
					dayCount=0;
					double localOccupation=0;
					while (current.isBefore(endPeriod)){
						//System.out.print(">>"+interval.getStart()+" "+current+" "+interval.getEnd());
						if (interval.getStart().isBefore(current) && interval.getEnd().isAfter(current)){
							localOccupation += involvement.getOccupation();
							//System.out.println(" OCCUPATION "+localOccupation);
							current = current.plusDays(1);
							dayCount= dayCount+1;
						}else{
							if(current.isBefore(interval.getStart())){
								current = current.plusDays(1);
							}
							if(current.isAfter(interval.getEnd())){
								break;
							}

							//break;
						}

					}
					if(dayCount>0){
						occupation+=localOccupation/dayCount;
					}
					//System.out.println(" Activity "+activity.getName()+" Resource "+res.getName()+" LocalOccupation "+localOccupation+ " Occupation "+occupation+" days "+dayCount);


				}

			}

		}
		//System.out.println("	final occupation  "+occupation);

		return occupation;
	}

}
