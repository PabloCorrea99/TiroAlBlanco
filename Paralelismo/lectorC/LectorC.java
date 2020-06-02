package Paralelismo.lectorC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorC extends Thread{
  
        public static String [] linea;

        @Override
        public void run(){       
            File archivo = null;
            FileReader lector = null;
            BufferedReader br = null;           
            try {
                archivo = new File("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
                lector = new FileReader(archivo);
                br = new BufferedReader(lector);
                LectorC.linea = new String[1116772];


                for (int i = 1; i <= 1116772 ; i++) {
                    linea [i-1] = br.readLine(); 
                }
                
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

            long inicioPro = System.currentTimeMillis();

            LectorC t1 = new LectorC();
    
            t1.start();

            t1.join();
            
            Lectorcitos h1 = new Lectorcitos(linea, 0, 1116772);                

            System.out.println(System.currentTimeMillis() - inicioPro + " milisegundos");
    
        }
    } 
