import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class InterfazIp {
    public static void main (String[] args){
        Icon icono = new ImageIcon("img/ip.png");
        JButton btn[] = new JButton[3];

        btn[0] = new JButton("Cadena normal");
        btn[1] = new JButton("Cuatro Bytes");
        btn[2] = new JButton("Salir");

        JOptionPane.showOptionDialog(null, 
            "Elija un método para introducir la IP", 
            "Introducir IP", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            icono, 
            btn, 
            btn[0]);
    }
}