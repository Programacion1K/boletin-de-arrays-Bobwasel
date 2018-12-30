import javax.swing.JOptionPane;

public class Ip {
    private int[] bytes;

    public Ip (String cadena) {
        bytes = new int[4];
        String[] partes = cadena.split("\\.");
        for (int i=0; i<partes.length; i++){
            bytes[i] = Integer.parseInt(partes[i]);
        }
    }

    public Ip (int[] bytes){
        this.bytes = bytes;

    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Dirección IP:"
                                    + bytes[0] + "." + bytes[1]
                                    + "." + bytes[2] + "."
                                    + bytes[3]);
    }
}