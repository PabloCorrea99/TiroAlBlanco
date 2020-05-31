import java.io.*;

class LeeFichero {
    public static void main(String [] arg) {
       File archivo = null;
       FileReader lector = null;
       BufferedReader br = null;
 
       try {
          archivo = new File ("C:\\archivo.txt");
          lector = new FileReader (archivo);
          br = new BufferedReader(lector);
 
          String linea;
          while((linea=br.readLine())!=null)
             System.out.println(linea);
       }
       catch(Exception e){
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
    }
 }