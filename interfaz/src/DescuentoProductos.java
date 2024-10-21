import java.util.Scanner;
import java.util.Arrays;

public class DescuentoProductos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Ingrese la cantidad de productos:");
        int cantidadProductos = sc.nextInt();


        double[] preciosOriginales = new double[cantidadProductos];


        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            preciosOriginales[i] = sc.nextDouble();
        }


        double[] preciosFinales = calcularPrecioFinal(preciosOriginales, 10.0);


        System.out.println("Precios originales: " + Arrays.toString(preciosOriginales));
        System.out.println("Precios con descuento: " + Arrays.toString(preciosFinales));

        sc.close(); // Cerrar el scanner
    }


    public static double[] calcularPrecioFinal(double[] preciosOriginales, double descuento) {
        double[] preciosConDescuento = new double[preciosOriginales.length];

        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosConDescuento[i] = preciosOriginales[i] - (preciosOriginales[i] * descuento / 100);
        }

        return preciosConDescuento;
    }
}
