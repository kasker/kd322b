package BikeShop;

public class Bikes {
	private String color;
	private int size;
	private int price;
	private int nbrOfBikes;

	/**  Creates a bike with instance-variables limited by values in Constants.java	*/
	public Bikes(String _color, int _size){
		color = Constants.colorCheck(_color);
		
		if(_size > Constants.MIN_SIZE){
			size = _size;
			
		} else {
			_size = Constants.MIN_SIZE;
		}
		
		if(_size< Constants.MAX_SIZE){
			size = _size;
		} else {
			_size = Constants.MAX_SIZE;
		}
		
	}
	
	/**  Creates a bike with instance-variables limited by values in Constants.java	*/
	public Bikes(String _color, int _size, int _price){
		color = Constants.colorCheck(_color);
		//size
		if(_size > Constants.MIN_SIZE){
			size = _size;
			
		} else {
			_size = Constants.MIN_SIZE;
		}
		
		if(_size< Constants.MAX_SIZE){
			size = _size;
		} else {
			_size = Constants.MAX_SIZE;
		}
		//price
		if(price > Constants.MIN_PRICE){
			_size = _size;
		}else {
			_size = Constants.MIN_PRICE;
		}
		if(_price < Constants.MAX_PRICE){
			price = _price;
		} else {
			_price = Constants.MAX_PRICE;
		}
		
		
	}
	
	
	public String getColor(){
		return color;
		
	}
	
	
	public int getSize() {
		return size;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void  setPrice(int _price) {
		
	}
	 
	
	public int getNumberOfBikes(){
		return nbrOfBikes;
		
		
	}
	
	
}
