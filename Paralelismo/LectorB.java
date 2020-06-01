package TiroAlBlanco.paralelismo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorB extends Thread {

    private int inicio;
    private int fin;
    private long lineas;

    public LectorB(int inicio, int fin, long lineas){
        this.inicio = inicio;
        this.fin = fin;
        this.lineas = lineas;
    }

    @Override
    public void run(){
        long inicioPro = System.currentTimeMillis();
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;           
        try {
            archivo = new File("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
            lector = new FileReader(archivo);
            br = new BufferedReader(lector);
            String linea;
            String valor [];
            double columna1;
            double columna2;
            double columna3;
            double columna4;
            double max1, max2, max3, max4;
            double min1, min2, min3, min4;
            valor = new String[7];
            linea = br.readLine();
            valor = linea.split(";");
            long numLineas = linea.length();
            columna1 = Double.parseDouble(valor [2]);
            columna2 = Double.parseDouble(valor [3]);
            columna3 = Double.parseDouble(valor [4]);
            columna4 = Double.parseDouble(valor [5]);
            max1 = columna1;
            max2 = columna2;
            max3 = columna3;
            max4 = columna4;
            min1 = columna1;
            min2 = columna2;
            min3 = columna3;
            min4 = columna4;
            long caracteres = lineas * numLineas ;
            br.skip(caracteres);
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
            System.out.print("El maximo de la columna uno es:"+max1+'\n'+
            "El minimo de la columna uno es:"+min1+'\n'+
            "El maximo de la columna uno es:"+max2+'\n'+
            "El minimo de la columna uno es:"+min2+'\n'+
            "El maximo de la columna uno es:"+max3+'\n'+
            "El minimo de la columna uno es:"+min3+'\n'+
            "El maximo de la columna uno es:"+max4+'\n'+
            "El minimo de la columna uno es:"+min4+'\n');
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(null != lector) {
                    lector.close(); 
                    System.out.println(System.currentTimeMillis()-inicioPro + " milisegundos");
                }
            }catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args)   {
       LectorB t1 = new LectorB(2,10000,0);
       LectorB t2 = new LectorB(10001,100000,10000);
       t1.start();
       t2.start();
       
    }
}
