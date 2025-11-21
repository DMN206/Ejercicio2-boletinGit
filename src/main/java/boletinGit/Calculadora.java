package boletinGit;

import java.util.Scanner;

public class Calculadora {
    public static double calculadora(Scanner sc) {
        System.out.println("Introduce el primer operando: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el operador ('+', '-', '*', '/'): ");
        String operador = sc.next();
        while (!(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/"))) {
            System.out.println("Operador no válido, introdúcelo de nuevo: ");
            operador = sc.next();
        }
        System.out.println("Introduce el segundo operando: ");
        double n2 = sc.nextDouble();
        return init(n1, operador, n2, sc);
    }
    private static double init(double n1, String operador, double n2, Scanner sc) {
        switch (operador) {
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                while (n2==0) {
                    System.out.println("No se puede dividir entre 0, vuelve a introducir un segundo operando: ");
                    n2 = sc.nextDouble();
                }
                return n1/n2;
            default:
                return 9999;
        }
    }
}
