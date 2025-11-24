package boletinGit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pr ́actica de Git: ejercicio 2");
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        NumeroPrimo numPrimo = new NumeroPrimo();
        do {
            System.out.println("\nInserte una opci ́on:");
            System.out.println("\t1 - CALCULADORA N ́UMEROS" +
                    "\n\t2 - NUMEROS PRIMOS" +
                    "\n\t3 - CALCULADORA FIGURAS" +
                    "\n\t4 - CALCULADORA DE NOTAS" +
                    "\n\t0 - EXIT\n");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    double resultado = Calculadora.calculadora(sc);
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 2:
                    System.out.print("Introduce un número para verificar si es primo: ");
                    int numero = sc.nextInt();
                    numPrimo.decirSioNoPrimo(numero);
                    break;

                case 3:
                    double area = CalculadoraAreas.calcularArea(sc);
                    System.out.println("El area es: " +area);
                    break;
                case 4:
// insertar codigo aqui
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("ERROR: Opci ́on no reconocida.");
            }
        } while (opcion != 0);
    }
}


