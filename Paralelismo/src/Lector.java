

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

// Esta clase lee el archivo que se le esta especificando y lo guarda en una matriz,
// tambien tiene un metodo que obtiene el tamaño del archivo que se le esta pasando.
public class Lector {
    
    long tamaño = 0;

    public long getTamaño() {
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;
        try {
            archivo = new File ("DAT_ASCII_EURUSD_M1_2017_2019.csv");
            lector = new FileReader (archivo);
            br = new BufferedReader(lector);
            tamaño = br.lines().count();
        } catch (Exception e){
            e.printStackTrace();
        }
        return tamaño;
    }

    public synchronized double [][] lectura (String direccion){
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;
        double [][] valores;
        double [][] aux = new double [0][0];
        try {
            archivo = new File (direccion);
            lector = new FileReader (archivo);
            br = new BufferedReader(lector);
            valores = new double [(int)tamaño][4];
            String linea;
            String [] secciones = new String [7];
            int i = 0; 
            int j;
            while((linea=br.readLine())!=null){

                j=0;
                secciones =  linea.split(";");
                valores [i][j] = Double.parseDouble(secciones[2]);
                j++;
                valores [i][j] = Double.parseDouble(secciones[3]);
                j++;
                valores [i][j] = Double.parseDouble(secciones[4]);
                j++; 
                valores [i][j] = Double.parseDouble(secciones[5]);
                i++;
            }
            return valores;

        }catch(Exception e){
            e.printStackTrace();
         }finally{
            try{                    
               if( null != lector ){   
                  lector.close(); 
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
        return aux;
    }

}