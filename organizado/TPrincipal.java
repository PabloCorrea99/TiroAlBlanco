package organizado;

public class TPrincipal extends Thread {
    private Lector lector = new Lector(); 
    public long tamaño = lector.getTamaño();
    public double [][] valores = new double [(int)tamaño][4];

    public void run(){
        this.valores = lector.lectura("/Users/carlosmesa/Documents/Universidad/5SEMESTRE/Organizacion de computadores/Practica final/Codigo/TiroAlBlanco/paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
    }
}