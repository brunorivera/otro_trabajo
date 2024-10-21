//Ejercicio 1: Cálculo de ingresos mensuales
//Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una
// función que use un bucle para calcular los ingresos totales mensuales.

import java.util.Scanner;

public class Calculo_Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;


        vender(suma, sc);

        sc.close();
    }


    public static void vender(int suma, Scanner sc) {
        int diasDelMes = 30;

        for (int dia = 1; dia <= diasDelMes; dia++) {
            System.out.print("Ingresa las ventas del día " + dia + ": ");
            int ventas = sc.nextInt();
            suma += ventas;
        }

        System.out.println("Las ventas totales del mes son: " + suma);
    }
}








