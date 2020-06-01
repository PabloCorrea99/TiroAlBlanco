package TiroAlBlanco.paralelismo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorB {
    
    public static void main(String[] args) {    

        class CalcularHilos extends Thread{
            
            public void run (int incio, int fin){
                long inicioPro = System.currentTimeMillis();
                File archivo = null;
                FileReader lector = null;
                BufferedReader br = null;           
                try {
                    archivo = new File("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\LectorB.java");
                    lector = new FileReader(archivo);
                    br = new BufferedReader(lector);
                    String valor [];
                    double columna1;
                    double columna2;
                    double columna3;
                    double columna4;
                    double max1, max2, max3, max4;
                    double min1, min2, min3, min4;
                    valor = new String[7];
                    valor = br.readLine().split(";");
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
                    for (int i = incio; i <= fin ; i++) {
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
                    System.out.println("El maximo de la columna uno es:"+max1);
                    System.out.println("El minimo de la columna uno es:"+min1);
                    System.out.println("------------------------------------");
                    System.out.println("El maximo de la columna dos es:"+max2);
                    System.out.println("El minimo de la columna dos es:"+min2);
                    System.out.println("------------------------------------");
                    System.out.println("El maximo de la columna tres es:"+max3);
                    System.out.println("El minimo de la columna tres es:"+min3);
                    System.out.println("------------------------------------");
                    System.out.println("El maximo de la columna cuatro es:"+max4);
                    System.out.println("El minimo de la columna cuatro es:"+min4);
                    System.out.println("------------------------------------"); 
                    /*
                    while((linea=br.readLine())!=null){
                        
                    }
                    */
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
        }
        CalcularHilos t1 = new CalcularHilos();
        CalcularHilos t2 = new CalcularHilos();
        CalcularHilos t3 = new CalcularHilos();
        CalcularHilos t4 = new CalcularHilos();
        CalcularHilos t5 = new CalcularHilos();
        CalcularHilos t6 = new CalcularHilos();
        CalcularHilos t7 = new CalcularHilos();
        CalcularHilos t8 = new CalcularHilos();
        CalcularHilos t9 = new CalcularHilos();
        CalcularHilos t10 = new CalcularHilos();
        CalcularHilos t11 = new CalcularHilos();
        CalcularHilos t12 = new CalcularHilos();
        CalcularHilos t13 = new CalcularHilos();
        CalcularHilos t14 = new CalcularHilos();
        CalcularHilos t15 = new CalcularHilos();
        CalcularHilos t16 = new CalcularHilos();
        CalcularHilos t17 = new CalcularHilos();
        CalcularHilos t18 = new CalcularHilos();
        CalcularHilos t19 = new CalcularHilos();
        CalcularHilos t20 = new CalcularHilos();
        t1.start(); t2.start(); t3.start(); t4.start();
        t5.start(); t6.start(); t7.start(); t8.start();
        t9.start(); t10.start(); t11.start(); t12.start();
        t13.start(); t14.start(); t15.start(); t16.start();
        t17.start(); t18.start(); t19.start(); t20.start();
    }

}