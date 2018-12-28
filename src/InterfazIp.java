import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazIp {
    public static void main (String[] args){
        Icon icono = new ImageIcon("img/ip.png");
        Object btn[] = {"Cadena normal", "Cuatro bytes", "Salir"};
        int noSalir = 1;

        while(noSalir == 1) {
            int resultado = JOptionPane.showOptionDialog(null, 
                                "Elija un método para introducir la IP", 
                                "Introducir IP", 
                                JOptionPane.YES_NO_CANCEL_OPTION, 
                                JOptionPane.QUESTION_MESSAGE, 
                                icono, 
                                btn, 
                                btn[2]);
            if(resultado == 0){

            } else if(resultado == 1){

            }else{
                noSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir?"
                            ,"Salir",JOptionPane.YES_NO_OPTION);
            }
        }
    }
}