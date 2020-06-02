package TiroAlBlanco.organizado;

public class TPrincipal extends Thread{
    public double [][] valores = new double [1116772][4];
    private Lector lector = new Lector(); 

    public void run(){
        this.valores = lector.lectura("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
    }
}