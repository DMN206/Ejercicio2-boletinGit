package boletinGit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {
    public static double mediaClase(Scanner sc){
        System.out.println("Introduce el número de alumnos de la clase: ");
        double alumnos = sc.nextInt();
        double nota = 0, contador = 0;
        for (int i=0; i<alumnos; i++) {
            System.out.println("Introduce la nota del alumno "+(i+1)+": ");
            nota = sc.nextInt();
            if (nota<0 || nota>10) {
                System.out.println("Nota inválida, vuelve a introducir una nota: ");
                nota = sc.nextInt();
            }
            contador += nota;
        }
        double media = contador/alumnos;
        System.out.print("La media de nota de toda la clase es: ");
        return media;
    }
}
