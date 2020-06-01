package paralelismo;

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
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;           
        try {
            archivo = new File("/Users/carlosmesa/Documents/Universidad/5SEMESTRE/Organizacion de computadores/Practica final/Codigo/TiroAlBlanco/paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
            lector = new FileReader(archivo);
            br = new BufferedReader(lector);
            String linea;
            String valor [];
            double columna1;
            double columna2;
            double columna3;
            double columna4;
            double max1, max2, max3, max4, maxtot;
            double min1, min2, min3, min4, mintot;
            valor = new String[7];
            linea = br.readLine();
            valor = linea.split(";");
            long numLineas = linea.length() + 1;
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
            br.skip(lineas * numLineas);
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
            System.out.println(Thread.currentThread());
            System.out.print("El maximo de la columna uno es:"+max1+'\n'+
            "El minimo de la columna uno es:"+min1+'\n'+
            "El maximo de la columna dos es:"+max2+'\n'+
            "El minimo de la columna dos es:"+min2+'\n'+
            "El maximo de la columna tres es:"+max3+'\n'+
            "El minimo de la columna tres es:"+min3+'\n'+
            "El maximo de la columna cuatro es:"+max4+'\n'+
            "El minimo de la columna cuatro es:"+min4+'\n');
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
       long inicioPro = System.currentTimeMillis();
       LectorB t1 = new LectorB(2,x,0);
       LectorB t2 = new LectorB(x+2,(2*x),x);
       
       LectorB t3 = new LectorB((x*2)+2, (3*x),x*2);
       
       LectorB t4 = new LectorB((x*3)+2, (4*x),x*3);
       
       LectorB t5 = new LectorB((x*4)+2, (5*x),x*4);
       
       LectorB t6 = new LectorB((x*5)+2, (6*x),x*5);
       
       LectorB t7 = new LectorB((x*6)+2, (7*x),x*6);
       
       LectorB t8 = new LectorB((x*7)+2, (8*x),x*7);
       
       LectorB t9 = new LectorB((x*8)+2, (9*x),x*8);
       
       LectorB t10 = new LectorB((x*9)+2, (10*x),x*9);
    
       LectorB t11 = new LectorB((x*10)+2, (11*x),x*10);
       
       LectorB t12 = new LectorB((x*11)+2, (12*x),x*11);
       
       LectorB t13 = new LectorB((x*12)+2, (13*x),x*12);
       
       LectorB t14 = new LectorB((x*13)+2, (14*x),x*13);
       
       LectorB t15 = new LectorB((x*14)+2, (15*x),x*14);
       
       LectorB t16 = new LectorB((x*15)+2, (16*x),x*15);
       
       LectorB t17 = new LectorB((x*16)+2, (17*x),x*16);
       
       LectorB t18 = new LectorB((x*17)+2, (18*x),x*17);
       
       LectorB t19 = new LectorB((x*18)+2, (19*x),x*18);

       LectorB t20 = new LectorB((x*19)+2, 1116772 ,x*19);

       t1.start(); t2.start();t3.start(); t4.start();
       t5.start(); t6.start();t7.start(); t8.start();
       t9.start(); t10.start();t11.start(); t12.start();
       t13.start(); t14.start();t15.start(); t16.start();
       t17.start(); t18.start();t19.start(); t20.start();
       t1.join(); t2.join();t3.join(); t4.join();
       t5.join(); t6.join();t7.join(); t8.join();
       t9.join(); t10.join();t11.join(); t12.join();
       t13.join(); t14.join();t15.join(); t16.join();
       t17.join(); t18.join();t19.join(); t20.join();

       System.out.println(System.currentTimeMillis()-inicioPro + " milisegundos");
       
       
    }
}
