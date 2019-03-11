import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String[] fortunes = {"Today is your lucky day!","You got the spirit!","Show the world what you can do!"};
	
	@Override
	public String getFortune() {
		
		Random r = new Random();
		int fortune = r.nextInt(3);
		
		return fortunes[fortune];
	}

}
