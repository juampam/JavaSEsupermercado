public class ProductController{
		static String name=null;
		static int cant=0;
		static String description=null;
		static double price=0;
		static int code=0;
		static Product list []= new Product[6];
		
		static ObtenerDatos entrada  = new ObtenerDatos();
		
		static ProductView vistaP=new ProductView();
		
		public void insert(){
			System.out.println("Ingrese el nombre");
			name = entrada.cadena();
			System.out.println("Ingrese la descripcion");
			description = entrada.cadena();
			System.out.println("Ingrese el precio");
			price = entrada.decimal();
			System.out.println("Ingrese la cantidad");
			cant=entrada.entero();
			code += 1;
			Product p = new Product(name, description, cant, price, code);
			
			for(int i = 0; i < list.length; i++){
				if(list[i]== null){
					list[i] = p;
					i = list.length;
				}
				
			}
			
		}
		public void edit(){
			System.out.println("Ingrese el codigo del producto a modificar");
			code = entrada.entero();
			for(int i = 0; i < list.length; i++){
				if(list[i] != null){
					if(list[i].getCode() == code){
						System.out.println(list[i].toString());
						System.out.println("Ingrese el nombre");
						name = entrada.cadena();
						System.out.println("Ingrese la description");
						description = entrada.cadena();
						System.out.println("Ingrese el precio");
						price = (double) entrada.decimal();
						Product p = new Product(name,  description, cant, price, code);
						list[i] = p;
						i = list.length;
				
					}
				}
				
			}
			
			
			
		}
		public void delete(){
			System.out.println("Ingrese el codigo");
			int buscar = entrada.entero();
			for(int i = 0; i < list.length; i++){
				if(list[i] != null){
						
					
					if(list[i].getCode() == buscar){
						System.out.println(list[i].toString());
						System.out.println("Esta seguro\n 1.Si\n 2.No");
						int opcion = entrada.entero();
						switch(opcion){
							case 1:
								list[i] = null;
							break;
							case 2:
								vistaP.menu();
							break;
							
						}
					}else{
						System.out.println("codigo inexistente");
						
					}
				}
				
			}
			
		}
		public void date(){
			for(int i = 0; i < list.length; i++){
				if(list[i] != null){
					System.out.println(list[i].toString());	
				}
			}
		}
		
		
		/*while(i < 10){
			Product p = new Product("nombre " + i, "description " + i, (double) i, i);
			product[i] = p;
			i++;
		}*/
		
	// product arreglo[]=new product[10];
	
}