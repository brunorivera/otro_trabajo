import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("ingrese el numero del que quiera saber su factorial");
      int numero = sc.nextInt();
      int factorial=1;

      for (int i=numero; i <= numero; i++){
          for(int j= 1; j<=numero;j++){
              factorial = factorial * j;
              System.out.println(factorial);
          }

      }
    }
}
