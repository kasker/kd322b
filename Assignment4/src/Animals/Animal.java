package Animals;

	// this is where the animal is created

public abstract class Animal {

	public String name; //variables for all diffrent animals

	public Animal(String name){ //changes with all diffrent animals
		this.name = name;
	}
	
	public abstract String getInfo();
	
}
