package organizado;

public class MultiProcesador extends Thread{
    public int inicio, fin;
    public double [] subresultados;
    private Lector lector = new Lector(); 
    private double [][] valores = new double [1116772][4];
    
    
    public MultiProcesador(int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    public void run(){
        valores = lector.lectura("C:/cygwin64/home/spulgarinv/st0254/254sspulgarinv/Nand2Tetris/nand2tetris/tool/TiroAlBlanco/Paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
        double max1 = 0;
        double max2 = 0;
        double max3 = 0;
        double max4 = 0;
        double min1 = 10.0;
        double min2 = 10.0;
        double min3 = 10.0;
        double min4 = 10.0;
        int j;
        for (int i = 0; i < valores.length; i++) {
            j = 0;
            if (valores[i][j] > max1)
                max1 = valores[i][j];
            else if (valores[i][j] < min1)
                min1 = valores[i][j];
            j ++;    
            if (valores[i][j] > max2)
                max2 = valores[i][j];
            else if (valores[i][j] < min2)
                min2 = valores[i][j];
            j++;
            if (valores[i][j] > max3)
                max3 = valores[i][j];
            else if (valores[i][j] < min3)
                min3 = valores[i][j];
            j++;
            if (valores[i][j] > max4)
                max4 = valores[i][j];
            else if (valores[i][j] < min4)
                min4 = valores[i][j];
        }
        this.subresultados[0] = max1;
        this.subresultados[1] = min1;
        this.subresultados[2] = max2;
        this.subresultados[3] = min2;
        this.subresultados[4] = max3;
        this.subresultados[5] = min3;
        this.subresultados[6] = max4;
        this.subresultados[7] = min4;
        
    }
}