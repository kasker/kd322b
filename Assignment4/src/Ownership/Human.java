package Ownership;

public class Human {
	private Dog myDog;
	private String name;
	
	public Human( String name ){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void buyDog (Dog dog){
		if(dog == null){
			
		} else {
		this.myDog = dog;
		}
	}
	
	public String getInfo(){
		String infoName = "";
		if(name != null){
		infoName =  getName() +" owns a dog called " + myDog.getName()+ "\n";	
		} else {
			return infoName;
		}
		
		return infoName;
	}
}
