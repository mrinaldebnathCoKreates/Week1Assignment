
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		BaseballCoach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);

		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
