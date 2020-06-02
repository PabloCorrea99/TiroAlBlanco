

// Esta clase es la que define el comportamiento de los hilos secundarios del punto C.
// Estos hilos reciben una matriz y analizan la parte que les corresponde de la misma
// definiendo asi una serie de subrresultados que son los valores maximos y minimos de
// la parte de la matriz que se les entregó y los devuelven.
public class TSecundario extends Thread {
    
    public int inicio, fin;
    public double [][] valores;
    public double [] subresultados = new double [8];
    
    public TSecundario(double [][] valores, int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
        this.valores = valores;
    }

    public void run(){
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