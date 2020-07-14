public class Usuario{
	String nombre;
	String clave;
	String rol;
	public Usuario(){
		this.nombre="Mariela";
		this.clave="popo";
		this.rol="administrador";
		
		}
	public String geNombre(){
		return nombre;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}
	
}