package Dia1;

import java.util.Scanner;

public class Vector {


	    private Scanner teclado;
	    private int[] sueldos;
		
	    public void cargar()
	    {
	        teclado=new Scanner(System.in);
	        sueldos=new int[5];
	        for(int f=0;f<5;f++) {
	            System.out.print("Ingrese valor de la componente:");
	            sueldos[f]=teclado.nextInt();
	        }	
	    }
		
	    public void imprimir() {
	        for(int f=0;f<5;f++) {
	            System.out.println(sueldos[f]);
	        }
	    }
		
	    public static void main(String[] ar) {
	    	Vector pv=new Vector();
	        pv.cargar();
	        pv.imprimir();
	    }
	}


