import javax.swing.JOptionPane;

public class Ip {
    private int[] bytes;

    public Ip (int[] bytes){
        this.bytes = bytes;

    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Dirección IP:"
                                    + this.bytes[0] + "." + bytes[1]
                                    + "." + bytes[2] + "."
                                    + bytes[3]);
    }
}