package Paralelismo.src;

// Esta clase es utilizada para el punto C y define el comportamiento del hilo
// principal del programa, por lo tanto solo debe leer el archivo y entregar 
// una matriz con los datos del mismo.
public class TPrincipal extends Thread {
    private Lector lector = new Lector(); 
    public long tamaño = lector.getTamaño();
    public double [][] valores = new double [(int)tamaño][4];

    public void run(){
        this.valores = lector.lectura("DAT_ASCII_EURUSD_M1_2017_2019.csv");
    }
}