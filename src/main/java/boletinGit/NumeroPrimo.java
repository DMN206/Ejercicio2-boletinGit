package boletinGit;
import java.util.Scanner;

public class NumeroPrimo {

    public boolean esPrimo(int numero) {
        if (numero < 2 || (numero != 2 && numero % 2 == 0)) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void decirSioNoPrimo(int numero) {
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}
