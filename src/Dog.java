
public class Dog extends Animal{
	public String name;
	
	public Dog (String name) {
		this.name=name;
	}
	
	public Dog() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void makeSound(String sound) {
		System.out.println("The noise " + name +  " makes is " + sound);
	}

}
