//Ejercicio 5: Promedio de satisfacción del cliente
//Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.


import java.util.Scanner;

public class Promedio_Felicidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas a promediar");
        int cantidad = sc.nextInt();
        int [] calificacion = new int  [cantidad];
        for (int i = 0; i< cantidad; i++){
            System.out.println("coloque el puntaje de la persona numero "+ (i+1));
            calificacion[i]= sc.nextInt();
        }
        calcularPromedioSatisfaccion(calificacion,cantidad);

    }
    public static void calcularPromedioSatisfaccion(int [] calificacion,int cantidad){
        int suma = 0, promedio;
        for (int i = 0; i< cantidad; i++){
            suma = suma + calificacion[i];
        }
        promedio = suma / cantidad;

        System.out.println(" el promedio de felicidad es de "+ promedio);
    }
}
