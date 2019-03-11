

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
		
	// create a no-arg constructor
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("TrackCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("TrackCoach: inside setter method - setTeam");
		this.team = team;
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public void doMyStartupStuff() {
		// TODO Auto-generated method stub
		System.out.println("Initiating TrackCoach coach interface ....");
		
	}

	@Override
	public void doMyCleanupStuffYoYo() {
		// TODO Auto-generated method stub
		System.out.println("Destryoing TrackCoach coach interface ....");
		
	}

}
