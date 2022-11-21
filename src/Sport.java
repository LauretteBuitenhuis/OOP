
// This is a class

public class Sport {
	private String name;
	
	// Constructor without any input arguments
	public Sport() {
		
	}
	
	// Constructor with input arguments
		public Sport(String name) {
			this.name = name;
		}
		
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	// Method:
	public void startSport() {
		System.out.println("You started the sport " + name + ", congratulations!");
	}
	
	public String startMatch(int amountCompetitors, int startTime) {
		System.out.println("Competition day! We have " + amountCompetitors + " competitors today. Hurry, the match will start at " + startTime + " o'clock.");
		return "Enjoy!"; 
		
	}
	

}
