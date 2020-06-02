

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Esta clase define el comportamiento que va a tener cada uno de los hilos para el punto B.
// Cada uno de los hilos abre el archivo, lee la parte que le corresponde y guarda los datos 
// en un array y entre esos datos calcula cual es el maximo y cual es el minimo para cada una de las columnas.
public class MultiProcesador extends Thread{

    /*
    public int inicio, fin;
    public double [] subresultados;
    private Lector lector = new Lector(); 
    private double [][] valores = new double [1116772][4];
    
    
    public MultiProcesador(int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    public void run(){
        valores = lector.lectura("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
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
    }*/
    
    private int inicio;
    private int fin;
    private long lineas;
    private String direccion;
    public double max1;
    public double max2;
    public double max3;
    public double max4;
    public double min1;
    public double min2;
    public double min3;
    public double min4;

    public MultiProcesador(int inicio, int fin, long lineas, String direccion){
        this.inicio = inicio;
        this.fin = fin;
        this.lineas = lineas;
        this.direccion = direccion;
    }

    @Override
    public void run(){       
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;           
        try {
            String valor [];
            double columna1;
            double columna2;
            double columna3;
            double columna4;
            double max1, max2, max3, max4;
            double min1, min2, min3, min4;
            valor = new String[7];
            max1 = 0;
            max2 = 0;
            max3 = 0;
            max4 = 0;
            min1 = 10.0;
            min2 = 10.0;
            min3 = 10.0;
            min4 = 10.0;
            try{
                archivo = new File(direccion);
                lector = new FileReader(archivo);
                br = new BufferedReader(lector);
                br.skip(lineas * 54);
                for (int i = inicio; i <= fin ; i++) {
                    valor = br.readLine().split(";");
                    columna1 =  Double.parseDouble(valor [2]);
                    columna2 =  Double.parseDouble(valor [3]);
                    columna3 =  Double.parseDouble(valor [4]);
                    columna4 =  Double.parseDouble(valor [5]);
                    if (columna1 > max1)
                        max1 = columna1;
                    else if (columna1 < min1)
                        min1 = columna1;
                    if (columna2 > max2)
                        max2 = columna2;
                    else if (columna2 < min2)
                        min2 = columna2;
                    if (columna3 > max3)
                        max3 = columna3;
                    else if (columna3 < min3)
                        min3 = columna3;
                    if (columna4 > max4)
                        max4 = columna4;
                    else if (columna4 < min4)
                        min4 = columna4;
                }
            }catch(Exception nullPointerException ){
                archivo = new File(direccion);
                lector = new FileReader(archivo);
                br = new BufferedReader(lector);
                br.skip(lineas * 55);
                for (int i = inicio; i <= fin ; i++) {
                    valor = br.readLine().split(";");
                    columna1 =  Double.parseDouble(valor [2]);
                    columna2 =  Double.parseDouble(valor [3]);
                    columna3 =  Double.parseDouble(valor [4]);
                    columna4 =  Double.parseDouble(valor [5]);
                    if (columna1 > max1)
                        max1 = columna1;
                    else if (columna1 < min1)
                        min1 = columna1;
                    if (columna2 > max2)
                        max2 = columna2;
                    else if (columna2 < min2)
                        min2 = columna2;
                    if (columna3 > max3)
                        max3 = columna3;
                    else if (columna3 < min3)
                        min3 = columna3;
                    if (columna4 > max4)
                        max4 = columna4;
                    else if (columna4 < min4)
                        min4 = columna4;
                }
            }

            this.max1 = max1;
            this.max2 = max2;
            this.max3 = max3;
            this.max4 = max4;
            this.min1 = min1;
            this.min2 = min2;
            this.min3 = min3;
            this.min4 = min4;
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(null != lector) {
                    lector.close(); 
                    
                }
            }catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}