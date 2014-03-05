package Animals;

public class Snake extends Animal{
	public boolean hasPoison;
	
	public Snake(String name, boolean isPoison){
		super(name);
		this.hasPoison = isPoison;
	}
	
	@Override
	public String getInfo(){
		String info = "The snake called " + this.name + "\n" + "Has";
		if(this.hasPoison == true){
			info = info + " poison, watch out! \n";
		} else {
			info = info + " no poison, go on and pet it! \n";
		}
		return info;
	}
}
