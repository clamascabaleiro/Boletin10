package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Juego {

    private int numIntentos;
    private int num1;

    public void juego() {
        num1 = (int) (Math.random() * 50) + 1;
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de intentos : "));
        do {
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero : "));
            if (Math.abs(num1-num2) > 20){
                JOptionPane.showMessageDialog(null, "moi lonxe");
            }
            else if (Math.abs(num1-num2) >=10){
                JOptionPane.showMessageDialog(null, "lonxe");
            }
            else if (Math.abs(num1-num2) > 5){
                JOptionPane.showMessageDialog(null, "preto");
            }
            else if (Math.abs(num1-num2) > 0){
                JOptionPane.showMessageDialog(null, "moi preto");
            }
            else if (Math.abs(num1-num2) == 0){
                JOptionPane.showMessageDialog(null, "adivinaste el numero");
                break;
            }
            numIntentos = numIntentos - 1;
        } while (numIntentos != 0);
    }
}
