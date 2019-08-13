package OOP;

public class Autos extends Carro{
	
    String estilo;
    double area(){
        return base*altura/2; //Error! no se puede acceder
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }

}
