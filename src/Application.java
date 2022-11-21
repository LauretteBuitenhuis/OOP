
public class Application {

	public static void main(String[] args) {
		System.out.println("Het werkt echt!");

		Sport running = new Sport("running");		// This makes a new object running of the class Sport
		//running.name="running";
		
		System.out.println("The name of our sport is " + running.getName());
		
		running.startSport();
		
		running.startMatch(10000, 10);
		
		Dog puk = new Dog("Puk");
		puk.makeSound("woef");
		
	}

}