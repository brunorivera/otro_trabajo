//Ejercicio 8: Control de horas trabajadas
//Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.

import java.util.Scanner;

public class Horas_Trabajadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de empleados");
        int cantidad = sc.nextInt();
        String [] nombres = new String[cantidad];
        int [] horas = new int [cantidad];
        for (int i = 0;i<cantidad;i++){
            System.out.println("ingrese el nombre del trabajador numero "+ (i +1));
            nombres[i] = sc.nextLine();
            System.out.println("ingrese la cantidad de horas trabajadas por ese trabajador");
            horas[i]= sc.nextInt();
        }
        horasTrabajadas(horas,nombres,cantidad);
    }
    public static void horasTrabajadas(int [] horas, String[] nombres, int cantidad){
        int gana=15;
        for (int i = 0; i< cantidad; i++){
            System.out.println("el trabajador llamado "+ nombres[i] + " que trabajo un total de "+ horas[i] + "gano un total de "+ (horas[i]*gana));
        }
    }
}
