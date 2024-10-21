

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el inicio del rango:");
        int inicio = scanner.nextInt();

        System.out.println("Introduce el fin del rango:");
        int fin = scanner.nextInt();


        for (int i = inicio; i <= fin; i++) {
            boolean esPrimo = true;

            if (i == 1) {
                esPrimo = false;
            }


            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }


            if (esPrimo) {
                System.out.println(i + " es un número primo.");
            }
        }
    }
}
