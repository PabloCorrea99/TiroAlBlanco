package organizado;

public class Procesador {
    public double [] procesar (double [][] valores){
        double [] resultados = new double [8];
        double max1 = 0, max2 = 0, max3 = 0, max4 = 0;
        double min1 = 10.0, min2 = 10.0, min3 = 10.0, min4 = 10.0;
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
        resultados[0] = max1;
        resultados[1] = min1;
        resultados[2] = max2;
        resultados[3] = min2;
        resultados[4] = max3;
        resultados[5] = min3;
        resultados[6] = max4;
        resultados[7] = min4;
        return resultados;
    }
}