package com.assignment.assignmentnew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");	
			
		
		//String coachType = "tennisCoachPrototype";
		String coachType = "tennisCoachSingleton";
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean(coachType, Coach.class);

		Coach alphaCoach = context.getBean(coachType, Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}








