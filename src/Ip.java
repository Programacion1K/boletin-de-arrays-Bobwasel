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
        String salida = "";
        salida += getDireccionIp() + "\n";
        salida += getIdRed() + "\n";
        salida += getMascaraRed() + "\n";
        salida += getEsPrivada() + "\n";
        salida += getClase() + "\n";
        salida += getEsIdRed();

        JOptionPane.showMessageDialog(null, salida);
    }

    public String getDireccionIp(){
        return "Dirección IP: " + bytes[0] + "." + bytes[1] + "." + bytes[2] +
                "." + bytes[3];
    }

    public String getIdRed(){
        return "ID de red:" + bytes[0] + "." + bytes[1] + "." + bytes[2] + ".0";
    }

    public String getMascaraRed(){
        return null;
    }

    public String getEsPrivada(){
        String cadena = "¿Es la red privada?: ";
        if(bytes[0] == 10 || bytes[0] == 172 || bytes[0] == 192){
            cadena += "Es privada";
        } else {
            cadena += "No es privada";
        }
        return cadena;
    }

    public String getClase(){
        String clase = "Clase: ";
        if(bytes[0] >= 0 && bytes[0] <= 127){
          clase += "A";
        } 
        if (bytes[0] >= 128 && bytes[0] <= 191){
            clase += "B";    
        }
        if (bytes[0] >= 192 && bytes[0] <= 223){ 
            clase += "C";
        }
        return clase;
    }

    public String getEsIdRed() {
        String idRed = "¿Es ID de red? ";
        if (bytes[3] == 0){
            idRed += "Es ID de red";
        } else {
            idRed += "No es ID de red";
        }
        return idRed;
    }
}