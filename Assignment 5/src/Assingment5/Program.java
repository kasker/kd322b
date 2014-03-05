package Assingment5;

public class Program { 				// name of my calls
	private String name; 			//string name variable to get name of programs
	private String code; 			// String code variable for each program
	private int woman; 				// variable to get all women in a program
	private int men; 				// variable to get all men in a program
	
	//this is the constructor of my program
	public Program(String name, String code, int woman, int men){ 
	this.name = name;				//it should write out the information i want from the xml file. 
	this.code = code;				//into my Jlable called programLable
	this.woman = woman;
	this.men = men;
	
	}
	
	
	public String getName(){
		return name; 				// method to get the name of my Program
									// returns name from XML
	}
	
	public String getCode(){
		return code; 				// method to get the code of my Program
									// returns code from XML
	}
	
	public int getWomen(){
		return woman; 				// method to get how many women are in one program
									// returns how many women from XML
	}
	
	public int getMen(){
		return men; 				// method to get how many men are in one program
									//returns how many men from XML
	}
	@Override
	public String toString(){
		return name;
	}
}
