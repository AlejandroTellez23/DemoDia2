package herencia;

import java.util.Scanner;

public class Condiciones {
	static float sueldo; 
	
	
	public void inicio() {
	    	Scanner teclado=new Scanner(System.in);	    		
	    	System.out.print("Ingrese el sueldo:");
	    	sueldo=teclado.nextFloat();
	}
	
    public void operacion() {
    	if (sueldo>=3000) {
    	    System.out.println("Esta persona debe abonar impuestos");        
    	}
    	}
	    	

	    

 }
	

