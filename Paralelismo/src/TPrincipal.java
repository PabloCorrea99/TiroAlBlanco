
// Esta clase es utilizada para el punto C y define el comportamiento del hilo
// principal del programa, por lo tanto solo debe leer el archivo y entregar 
// una matriz con los datos del mismo.
public class TPrincipal extends Thread {
    public String direccion;
    public long tamaño;
    public Lector lector = new Lector(); 
    public double [][] valores = new double [(int)tamaño][4];

    public TPrincipal(String archivo, long tamaño) {
        this.direccion = archivo;
        this.tamaño = tamaño;
    }

    public void run(){
        this.valores = lector.lectura(direccion);
    }
}