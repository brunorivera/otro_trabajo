//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // String nombre
        int numero1,numero2,total;
       numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
       total = numero1 + numero2;
       JOptionPane.showInternalMessageDialog(null,"El Resultado es  "+ total);
        }
    }
