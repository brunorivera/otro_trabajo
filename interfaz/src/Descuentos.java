//Ejercicio 4: Cálculo de descuentos para fidelización
//Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
// Si han comprado más de 10 veces, reciben un 10% de descuento.

import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String[] clientes = new String[cantidad];
        int[] compras = new int[cantidad];

        calcularDescuentos(clientes, compras, cantidad, sc);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras, int cantidad, Scanner sc) {
        float precio = 100;
        float descuento, total;


        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del cliente número " + (i + 1) + ":");
            clientes[i] = sc.nextLine();

            System.out.println("Ingrese la cantidad de compras:");
            compras[i] = sc.nextInt();
            sc.nextLine();
        }


        for (int i = 0; i < cantidad; i++) {
            if (compras[i] > 10) {
                descuento = precio * (10.0f / 100.0f);
                total = precio - descuento;
                System.out.println("El precio a pagar del cliente " + clientes[i] + " es " + total);
            }
        }
    }
}

