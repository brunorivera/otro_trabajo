import java.util.Scanner;

public class suma_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero del que quiera saber la suma de sus anteriores");
        int numero = sc.nextInt();
      int suma = 0;
      for(int i= numero; i <= numero; i++){
          for (int j=1; j<= numero;j++){
              suma= suma + j;
          }

          System.out.println("la suma del factorial de ese numero es "+ suma);
      }

    }
}
