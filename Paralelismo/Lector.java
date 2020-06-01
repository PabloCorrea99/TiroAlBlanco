package TiroAlBlanco.paralelismo;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

class Lector {
    public static void main(String [] arg) {
       long inicio = System.currentTimeMillis();
       File archivo = null;
       FileReader lector = null;
       BufferedReader br = null;

       try {
          archivo = new File ("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
          lector = new FileReader (archivo);
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
         try{
            while(br.readLine()!=null){
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

         }catch(Exception NullPointerException){
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
         }

      
       }
       catch(Exception e){
          e.printStackTrace();
       }finally{
          try{                    
             if( null != lector ){   
                lector.close(); 
                System.out.println(System.currentTimeMillis()-inicio + " milisegundos");  
             }                  
          }catch (Exception e2){ 
             e2.printStackTrace();
          }
       }
    }
 }