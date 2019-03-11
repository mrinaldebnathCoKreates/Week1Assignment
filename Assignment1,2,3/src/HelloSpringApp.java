

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve TrackCoach from spring container
		Coach trackCoach = context.getBean("myCoach1", Coach.class);
		
		// retrieve BaseballCoach from spring container
		Coach baseballCoach = context.getBean("myCoach2", Coach.class);
		
		// call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}







