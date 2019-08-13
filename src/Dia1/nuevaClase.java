package Dia1;

import java.util.Scanner;

public class nuevaClase {

	public static void main(String[] args) {
			Scanner td = new Scanner(System.in);
			int sueldo;
			int htrabajadas;
			int total;
			System.out.println("Ingrese el costo de horas");
			sueldo = td.nextInt();
			System.out.println("Ingrese las horas trabajadas");
			htrabajadas = td.nextInt();
			total = sueldo+htrabajadas;
			System.out.println(total);
			
	}

}
