public class Product{
	String name=null;
	String description=null;
	int cant=0;
	double price=0;
	int code=0;
	
	
public Product(String name, String description, int cant, double price, int code){
	this.name=name;
	this.description=description;
	this.cant=cant;
	this.price=price;
	this.code=code;
	
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public double getPrice(){
		return price;
	}
	public int getCode(){
		return code;
	}
	public int getCant(){
		return cant;
	}
	
	public String toString(){
		return "Nombre: " +  getName() + ", Descripcion: " + getDescription() + ", Precio: Q" + getPrice() + ", Codigo: " + getCode();
		
	}
}