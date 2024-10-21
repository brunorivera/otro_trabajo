// Ejercicio 2: Generar reportes de inventario
//Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.


import java.util.Scanner;

public class Reportes_inventario {
    public static void main(String[] args) {

        muestraInventario();
    }


    public static void muestraInventario() {
    String[] productos = {"Computadoras","Televisores","Telefonos"};
    int[] stock = {0,0,0};
    Scanner sc = new Scanner(System.in);
    for (int i= 0; i<3;i++){
        System.out.println("ingrese el stock del producto "+ productos[i]);
        stock[i] = sc.nextInt();
    }
    for (int i=0; i<3;i++){
        if(stock[i]<5){
            System.out.println("el producto "+ productos[i] + " tiene "+ stock[i] + " por lo tanto es menor a la minima cantidad de unidades requeridas");

        }
    }
    }

}
