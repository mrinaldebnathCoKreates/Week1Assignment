

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext contextPrototype =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		ClassPathXmlApplicationContext contextSingleton =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClassPathXmlApplicationContext context = contextPrototype;
				
		// retrieve bean from spring container
		BaseballCoach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);

		BaseballCoach alphaCoach = context.getBean("myBaseballCoach", BaseballCoach.class);
		
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








