package Animals;

public abstract class Mamal extends Animal {
	public int latchingTime;
	
	public Mamal(String name, int latchingTime){
		super(name); //calling superclass
		this.latchingTime = latchingTime; //this means that its looking for information inside THIS class
	}
}
