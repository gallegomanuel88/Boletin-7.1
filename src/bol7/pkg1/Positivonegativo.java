
package bol7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Positivonegativo {
    public int pedirNumero (){
        return (Integer.parseInt(JOptionPane.showInputDialog("Teclea numero ")));
    }
    public void comparar (int num){
        if (num>=0)
            System.out.println("El numero "+num+" es positivo");
        else if (num<0)
            System.out.println("Error el numero es negativo");
    }
}
