public class Principal{
	public static void main(String args[]){
		ProductView vistaP=new ProductView();
		ManejadorUsuario maneU=new ManejadorUsuario();
		maneU.login();
		vistaP.menu();
		
	}

}