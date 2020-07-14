public class ProductView{
	static ProductController prodCont=new ProductController();
	static ObtenerDatos entrada  = new ObtenerDatos();
	
public void menu(){
				
	System.out.println("Bienvenido prro :v");
		while(1 != 0){
		System.out.println("\n1. Mostrar");	
		System.out.println("2. Ingresar");
		System.out.println("3. Editar");
		System.out.println("4. Eliminar");
		int numero = entrada.entero(); 
		
			switch(numero){
				case 1:
					prodCont.date();
					break;
				case 2:
					prodCont.insert();
					break;
				case 3:
					prodCont.edit();
					break;
				case 4:
					prodCont.delete();
					break;
			}
			
		}
			
	}

}