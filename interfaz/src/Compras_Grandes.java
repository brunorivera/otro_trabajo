//Ejercicio 7: Descuento por compras grandes
//Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

import java.util.Scanner;

public class Compras_Grandes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compras que fueron hechas");
        int cantidad = sc.nextInt();
        int [] compras = new int[cantidad];
        for (int i = 0; i < cantidad; i++){
            System.out.println("ingrese el precio de la compra numero " + (i+1));
            compras [i]= sc.nextInt();
        }

        aplicarDescuento(compras,cantidad);
    }
    public static void aplicarDescuento(int [] compras, int cantidad){

        float promedio, total;

        for (int i= 0; i < cantidad; i++){
            if (compras[i]>500){
                promedio = (10.0f/100.0f) * compras[i];
                total = compras[i] - promedio;
                System.out.println("la compra numero "+ (i+1)+ " recibio un descuento por lo que ahora sale " + total +" $");
            }else{
                System.out.println("la compra numero "+ (i+1) + "no recibio ningun descuento por lo que vale lo mismo");
            }
        }
    }
}
