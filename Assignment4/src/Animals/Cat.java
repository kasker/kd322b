package Animals;

public class Cat extends Mamal{
	public int lifes;
	
	public Cat(String name, int latchingTime, int lifes){
		super(name, latchingTime);
		this.lifes = lifes;
	}
	
	@Override
	public String getInfo(){
		String info = "This cat is called" + this.name + "\n " + " It is latching for" + this.latchingTime + " weeks\n" + "and it has "+ this.lifes + " lifes left.\n" ;
		return info;
	}
}
