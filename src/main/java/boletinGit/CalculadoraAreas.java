package boletinGit;
import java.util.Scanner;

public class CalculadoraAreas {

    public static double calcularArea(Scanner sc){
        double pi = Math.PI;
        double area=0;
        System.out.println("Dime qué figura quieres escoger: ");
        String figura = sc.next();
        figura = figura.toLowerCase();

        switch (figura){
            case "circulo":
                System.out.println("Dime el radio del circulo: ");
                double radio = sc.nextDouble();
                area = pi * (radio*radio);
                break;

            case "triangulo":
                System.out.println("Dime la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.println("Dime la altura del triangulo: ");
                double altura = sc.nextDouble();
                area = (base*altura)/2;
                break;

            case "cuadrado":
                System.out.println("Dime cuanto mide el lado del cuadrado: ");
                double lado = sc.nextDouble();
                area = lado*lado;
                break;


        }
        return area;
    }
}
