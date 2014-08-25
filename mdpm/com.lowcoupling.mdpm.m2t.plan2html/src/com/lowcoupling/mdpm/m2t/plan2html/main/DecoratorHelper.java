package com.lowcoupling.mdpm.m2t.plan2html.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.util.ActivityElementDecorator;

public class DecoratorHelper {
	
	public String getActivityStart(com.lowcoupling.mdpm.lng.plan.plan.impl.ActivityElementImpl activity){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		ActivityElementDecorator dec = new ActivityElementDecorator(activity);
		
		return formatter.format(dec.getStartByCalendar().getTime());
	}
	
	public String getActivityEnd(com.lowcoupling.mdpm.lng.plan.plan.impl.ActivityElementImpl activity){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		ActivityElementDecorator dec = new ActivityElementDecorator(activity);
		return formatter.format(dec.getEndByCalendar().getTime());
	}
	
	public String getActivityName(com.lowcoupling.mdpm.lng.plan.plan.impl.ActivityElementImpl activity){
		if (activity.getLongName()!=null){
			return activity.getLongName();
		}
		return activity.getName();
	}
	
	
	public DecoratorHelper(){


	}
}
