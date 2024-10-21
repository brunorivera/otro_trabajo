//ejercicio 6: Cálculo de impuestos
// Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.



import java.util.Scanner;

public class Calulo_Impuestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de facturas");
        int cantidad = sc.nextInt();

        int [] facturas = new int [cantidad];

        for (int i=0;i< cantidad;i++){
            System.out.println("ingrese el monto de la factura numero "+ (i+1));
            facturas[i]= sc.nextInt();
        }
        calcularImpuesto(facturas,cantidad);



    }
    public static void calcularImpuesto(int [] facturas, int cantidad){
        float impuesto, porcentaje, suma;
        for (int i = 0; i< cantidad; i++){
            suma= 0;
            suma = suma + facturas[i];
            porcentaje= (21.0f/100.0f) * suma;
            impuesto = suma + porcentaje;

            System.out.println("el impuesto de la factura numero "+ (i+ 1)+ "es "+  impuesto);
        }


    }
}
