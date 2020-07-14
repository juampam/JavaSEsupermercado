public class ManejadorUsuario{
	Usuario us=new Usuario();
	String nombre=us.getNombre();
	String clave=us.getClave();
	String rol=us.getRol();
	ObtenerDatos entrada=new ObtenerDatos();
	String x=entrada.cadena();
	String y=entrada.cadena();
	String z=entrada.cadena();
	public void login(){
		if(z.equals(rol)){
		System.out.println("Usted ha ingresado como administrador");
			if(x.equals(nombre)&& y.equals(clave)){
				System.out.println("Bienvenido " + nombre);
			}
			
		}else{
			System.out.println("seguramente usted no es administrador, por favor asegurese de ingresar bin los datos");
		}
	
	}
	
	
}