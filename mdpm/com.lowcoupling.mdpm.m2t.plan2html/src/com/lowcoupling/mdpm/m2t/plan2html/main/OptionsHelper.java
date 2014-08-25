package com.lowcoupling.mdpm.m2t.plan2html.main;

import org.eclipse.core.runtime.preferences.ConfigurationScope;


public class OptionsHelper {

		public boolean isIntroductionToBeGenerated(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plan){
			return  ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences").getBoolean("generateIntro",true);
		}
		
		public boolean isPurposeToBeGenerated(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plan){
			return ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences").getBoolean("generatePurpose",true);
		}
		
		public boolean isGanttChartToBeGenerated(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plan){
			return ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences").getBoolean("generateGanttChart",true);
		}
		
		public boolean isScheduleTableToBeGenerated(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plan){
			return ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences").getBoolean("generateScheduleTable",true);
		}
		
		public boolean isScheduleToBeGenerated(com.lowcoupling.mdpm.lng.plan.plan.impl.ProgramImpl plan){
			return ConfigurationScope.INSTANCE.getNode("PMPGenerationPreferences").getBoolean("generateSchedule",true);
		}
		

}
