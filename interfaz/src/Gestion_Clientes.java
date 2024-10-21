// Ejercicio 3: Gestión de clientes
//Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas,
// pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.


import java.util.Scanner;

public class Gestion_Clientes {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("ingrese la cantidad de clientes");
       int cantidad = sc.nextInt();
       sc.nextLine();
       String[] clientes = new String [cantidad];
       int[] facturas = new int[cantidad];
        for (int i = 0; i < clientes.length;i++){
            System.out.println("ingrese el nombre del cliente numero "+ i);
            clientes[i] = sc.nextLine();


            System.out.println("ingrese la factura de ese cliente");
            facturas[i]= sc.nextInt();
            sc.nextLine();

        }

       Enviarfacturas(clientes,facturas);
        }
    public static void Enviarfacturas( String[] clientes, int[] facturas){
      for (int i = 0; i < clientes.length;i++){
          if ( facturas[i]> 500){
           System.out.println("el cliente "+ clientes[i] + " gana mas de 500$");
          }
      }
    }

}


