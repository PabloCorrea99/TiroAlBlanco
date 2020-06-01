package TiroAlBlanco.paralelismo.lectorC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lectorcitos extends Thread {

    private int inicio;
    private int fin;
    private long lineas;
    public double max1;
    public double max2;
    public double max3;
    public double max4;
    public double min1;
    public double min2;
    public double min3;
    public double min4;

    public Lectorcitos(int inicio, int fin, long lineas){
        this.inicio = inicio;
        this.fin = fin;
        this.lineas = lineas;
    }

    @Override
    public void run(){       
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
            max1 = 0;
            max2 = 0;
            max3 = 0;
            max4 = 0;
            min1 = 10.0;
            min2 = 10.0;
            min3 = 10.0;
            min4 = 10.0;
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

    public static void main(String[] args) throws InterruptedException {
        int x = 55830;
        double numeros1max[], numeros2max[], numeros3max[], numeros4max[];
        double numeros1min[], numeros2min[], numeros3min[], numeros4min[];
        numeros1max = new double[20];
        numeros2max = new double[20];
        numeros3max = new double[20];
        numeros4max = new double[20];
        numeros1min = new double[20];
        numeros2min = new double[20];
        numeros3min = new double[20];
        numeros4min = new double[20];


        long inicioPro = System.currentTimeMillis();

        LectorB t1 = new LectorB(2, x, 0);
        LectorB t2 = new LectorB(x + 1, (2 * x), x);
        LectorB t3 = new LectorB((x * 2) + 1, (3 * x), x * 2);
        LectorB t4 = new LectorB((x * 3) + 1, (4 * x), x * 3);
        LectorB t5 = new LectorB((x * 4) + 1, (5 * x), x * 4);
        LectorB t6 = new LectorB((x * 5) + 1, (6 * x), x * 5);
        LectorB t7 = new LectorB((x * 6) + 1, (7 * x), x * 6);
        LectorB t8 = new LectorB((x * 7) + 1, (8 * x), x * 7);
        LectorB t9 = new LectorB((x * 8) + 1, (9 * x), x * 8);
        LectorB t10 = new LectorB((x * 9) + 1, (10 * x), x * 9);
        LectorB t11 = new LectorB((x * 10) + 1, (11 * x), x * 10);
        LectorB t12 = new LectorB((x * 11) + 1, (12 * x), x * 11);
        LectorB t13 = new LectorB((x * 12) + 1, (13 * x), x * 12);
        LectorB t14 = new LectorB((x * 13) + 1, (14 * x), x * 13);
        LectorB t15 = new LectorB((x * 14) + 1, (15 * x), x * 14);
        LectorB t16 = new LectorB((x * 15) + 1, (16 * x), x * 15);
        LectorB t17 = new LectorB((x * 16) + 1, (17 * x), x * 16);
        LectorB t18 = new LectorB((x * 17) + 1, (18 * x), x * 17);
        LectorB t19 = new LectorB((x * 18) + 1, (19 * x), x * 18);
        LectorB t20 = new LectorB((x * 19) + 1, 1116772 , x * 19);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t20.start(); 

        t1.join(); t2.join(); t3.join(); t4.join();
        t5.join(); t6.join(); t7.join(); t8.join();
        t9.join(); t10.join(); t11.join(); t12.join();
        t13.join(); t14.join(); t15.join(); t16.join();
        t17.join(); t18.join(); t19.join(); t20.join();
        double max1, max2, max3, max4;
        double min1, min2, min3, min4;
        max1 = 0;
        max2 = 0;
        max3 = 0;
        max4 = 0;
        min1 = 10.0;
        min2 = 10.0;
        min3 = 10.0;
        min4 = 10.0;

        numeros1max [0] = t1.max1;
        numeros1max [1] = t2.max1;
        numeros1max [2] = t3.max1;
        numeros1max [3] = t4.max1;
        numeros1max [4] = t5.max1;
        numeros1max [5] = t6.max1;
        numeros1max [6] = t7.max1;
        numeros1max [7] = t8.max1;
        numeros1max [8] = t9.max1;
        numeros1max [9] = t10.max1;
        numeros1max [10] = t11.max1;
        numeros1max [11] = t12.max1;
        numeros1max [12] = t13.max1;
        numeros1max [13] = t14.max1;
        numeros1max [14] = t15.max1;
        numeros1max [15] = t16.max1;
        numeros1max [16] = t17.max1;
        numeros1max [17] = t18.max1;
        numeros1max [18] = t19.max1;
        numeros1max [19] = t20.max1; 

        for (int j = 0; j < numeros1max.length; j++) {
            if ( numeros1max[j]> max1)
                max1 = numeros1max[j];
        }

        numeros2max [0] = t1.max2;
        numeros2max [1] = t2.max2;
        numeros2max [2] = t3.max2;
        numeros2max [3] = t4.max2;
        numeros2max [4] = t5.max2;
        numeros2max [5] = t6.max2;
        numeros2max [6] = t7.max2;
        numeros2max [7] = t8.max2;
        numeros2max [8] = t9.max2;
        numeros2max [9] = t10.max2;
        numeros2max [10] = t11.max2;
        numeros2max [11] = t12.max2;
        numeros2max [12] = t13.max2;
        numeros2max [13] = t14.max2;
        numeros2max [14] = t15.max2;
        numeros2max [15] = t16.max2;
        numeros2max [16] = t17.max2;
        numeros2max [17] = t18.max2;
        numeros2max [18] = t19.max2;
        numeros2max [19] = t20.max2;

        for (int j = 0; j < numeros2max.length; j++) {
            if ( numeros2max[j]> max2)
                max2 = numeros2max[j];
        }

        numeros3max [0] = t1.max3;
        numeros3max [1] = t2.max3;
        numeros3max [2] = t3.max3;
        numeros3max [3] = t4.max3;
        numeros3max [4] = t5.max3;
        numeros3max [5] = t6.max3;
        numeros3max [6] = t7.max3;
        numeros3max [7] = t8.max3;
        numeros3max [8] = t9.max3;
        numeros3max [9] = t10.max3;
        numeros3max [10] = t11.max3;
        numeros3max [11] = t12.max3;
        numeros3max [12] = t13.max3;
        numeros3max [13] = t14.max3;
        numeros3max [14] = t15.max3;
        numeros3max [15] = t16.max3;
        numeros3max [16] = t17.max3;
        numeros3max [17] = t18.max3;
        numeros3max [18] = t19.max3;
        numeros3max [19] = t20.max3;

        for (int j = 0; j < numeros3max.length; j++) {
            if ( numeros3max[j]> max3)
                max3 = numeros3max[j];
        }

        numeros4max [0] = t1.max4;
        numeros4max [1] = t2.max4;
        numeros4max [2] = t3.max4;
        numeros4max [3] = t4.max4;
        numeros4max [4] = t5.max4;
        numeros4max [5] = t6.max4;
        numeros4max [6] = t7.max4;
        numeros4max [7] = t8.max4;
        numeros4max [8] = t9.max4;
        numeros4max [9] = t10.max4;
        numeros4max [10] = t11.max4;
        numeros4max [11] = t12.max4;
        numeros4max [12] = t13.max4;
        numeros4max [13] = t14.max4;
        numeros4max [14] = t15.max4;
        numeros4max [15] = t16.max4;
        numeros4max [16] = t17.max4;
        numeros4max [17] = t18.max4;
        numeros4max [18] = t19.max4;
        numeros4max [19] = t20.max4;

        for (int j = 0; j < numeros4max.length; j++) {
            if ( numeros4max[j]> max4)
                max4 = numeros4max[j];
        }

        numeros1min [0] = t1.min1;
        numeros1min [1] = t2.min1;
        numeros1min [2] = t3.min1;
        numeros1min [3] = t4.min1;
        numeros1min [4] = t5.min1;
        numeros1min [5] = t6.min1;
        numeros1min [6] = t7.min1;
        numeros1min [7] = t8.min1;
        numeros1min [8] = t9.min1;
        numeros1min [9] = t10.min1;
        numeros1min [10] = t11.min1;
        numeros1min [11] = t12.min1;
        numeros1min [12] = t13.min1;
        numeros1min [13] = t14.min1;
        numeros1min [14] = t15.min1;
        numeros1min [15] = t16.min1;
        numeros1min [16] = t17.min1;
        numeros1min [17] = t18.min1;
        numeros1min [18] = t19.min1;
        numeros1min [19] = t20.min1;

        for (int j = 0; j < numeros1min.length; j++) {
            if ( numeros1min[j]<min1 )
                min1 = numeros1min[j];
        }

        numeros2min [0] = t1.min2;
        numeros2min [1] = t2.min2;
        numeros2min [2] = t3.min2;
        numeros2min [3] = t4.min2;
        numeros2min [4] = t5.min2;
        numeros2min [5] = t6.min2;
        numeros2min [6] = t7.min2;
        numeros2min [7] = t8.min2;
        numeros2min [8] = t9.min2;
        numeros2min [9] = t10.min2;
        numeros2min [10] = t11.min2;
        numeros2min [11] = t12.min2;
        numeros2min [12] = t13.min2;
        numeros2min [13] = t14.min2;
        numeros2min [14] = t15.min2;
        numeros2min [15] = t16.min2;
        numeros2min [16] = t17.min2;
        numeros2min [17] = t18.min2;
        numeros2min [18] = t19.min2;
        numeros2min [19] = t20.min2;

        for (int j = 0; j < numeros2min.length; j++) {
            if ( numeros2min[j]<min2 )
                min2 = numeros2min[j];
        }

        numeros3min [0] = t1.min3;
        numeros3min [1] = t2.min3;
        numeros3min [2] = t3.min3;
        numeros3min [3] = t4.min3;
        numeros3min [4] = t5.min3;
        numeros3min [5] = t6.min3;
        numeros3min [6] = t7.min3;
        numeros3min [7] = t8.min3;
        numeros3min [8] = t9.min3;
        numeros3min [9] = t10.min3;
        numeros3min [10] = t11.min3;
        numeros3min [11] = t12.min3;
        numeros3min [12] = t13.min3;
        numeros3min [13] = t14.min3;
        numeros3min [14] = t15.min3;
        numeros3min [15] = t16.min3;
        numeros3min [16] = t17.min3;
        numeros3min [17] = t18.min3;
        numeros3min [18] = t19.min3;
        numeros3min [19] = t20.min3; 

        for (int j = 0; j < numeros3min.length; j++) {
            if ( numeros3min[j]<min3 )
                min3 = numeros3min[j];
        }

        numeros4min [0] = t1.min4;
        numeros4min [1] = t2.min4;
        numeros4min [2] = t3.min4;
        numeros4min [3] = t4.min4;
        numeros4min [4] = t5.min4;
        numeros4min [5] = t6.min4;
        numeros4min [6] = t7.min4;
        numeros4min [7] = t8.min4;
        numeros4min [8] = t9.min4;
        numeros4min [9] = t10.min4;
        numeros4min [10] = t11.min4;
        numeros4min [11] = t12.min4;
        numeros4min [12] = t13.min4;
        numeros4min [13] = t14.min4;
        numeros4min [14] = t15.min4;
        numeros4min [15] = t16.min4;
        numeros4min [16] = t17.min4;
        numeros4min [17] = t18.min4;
        numeros4min [18] = t19.min4;
        numeros4min [19] = t20.min4;

        for (int j = 0; j < numeros4min.length; j++) {
            if ( numeros4min[j]<min4 )
                min4 = numeros4min[j];
        }
        
        System.out.println("El maximo de la columna uno es:"+max1+'\n'+
            "El minimo de la columna uno es:"+min1+'\n'+
            "El maximo de la columna uno es:"+max2+'\n'+
            "El minimo de la columna uno es:"+min2+'\n'+
            "El maximo de la columna uno es:"+max3+'\n'+
            "El minimo de la columna uno es:"+min3+'\n'+
            "El maximo de la columna uno es:"+max4+'\n'+
            "El minimo de la columna uno es:"+min4);
        System.out.println(System.currentTimeMillis() - inicioPro + " milisegundos");

    }
}