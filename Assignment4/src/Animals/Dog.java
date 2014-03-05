package Animals;

public class Dog extends Mamal{

	public boolean mood;
	
	public Dog(String name,int latchingTime, boolean smart){
		super(name, latchingTime );
		this.mood = smart;
	}
	
	@Override
	public String getInfo(){
		String info = "This Dog is called " + this.name + "\n" + "And it nurses for " + this.latchingTime + " weeks and it is \n";
		if(this.mood == true){
			info = info + "a very smart dog. \n";
		} else {
			info = info + " an extreamly dumb dog. \n";
		}
		return info;
	}
}
