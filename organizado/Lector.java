package TiroAlBlanco.organizado;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class Lector {

    public double [][] lectura (String direccion){
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;
        double [][] valores = new double [1116772][4];
        try {
            archivo = new File (direccion);
            lector = new FileReader (archivo);
            br = new BufferedReader(lector);
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

        return valores;
    }

}