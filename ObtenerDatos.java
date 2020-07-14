import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerDatos{
	BufferedReader entrada=new BufferedReader (new InputStreamReader(System.in));
	
	public String cadena(){
		String valor=null;
		try{
			valor=entrada.readLine();
		}catch(IOException ioe){
			System.out.println("Error de entrada y salida");
			System.exit(1);
		}
		return valor;
	}
	public int entero(){
	
		String dato=null;
		int entero=0;
		try{
			dato=entrada.readLine();
			entero=Integer.parseInt(dato);
		}catch(IOException ioe){
			System.out.println("Error de entrada y salida");
			System.exit(1);
		}
		return entero; 
	}
	public double decimal(){
		String texto=null;
		double decimal=0;
		try{
			texto=entrada.readLine();
			decimal=Double.parseDouble(texto);
		}catch(IOException ioe){
			System.out.println("Error de entrada y salida");
			System.exit(1);
		}
		return decimal; 
	}
}

