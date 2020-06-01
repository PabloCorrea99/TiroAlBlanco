package paralelismo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorB extends Thread {
    
    public static void main(String[] args) {
        String linea;
        String cadena_particionada[];
        File archivo = null;
        FileReader lector = null;
        BufferedReader br = null;

        int fila;

        try {
            archivo = new File("C:/cygwin64/home/spulgarinv/st0254/254sspulgarinv/Nand2Tetris/nand2tetris/tools/Proyecto Final/paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
            lector = new FileReader(archivo);
            br = new BufferedReader(lector);

            fila = 0;
            double datos[][] = new double[1116772][4]; 

            while((linea = br.readLine()) != null) {
                cadena_particionada = linea.split(";");

                for(int i=2; i<=5; i++) {
                    datos[fila][i-2] = Double.parseDouble(cadena_particionada[i]);
                }
                fila ++;
            }
            System.out.println(datos[0][0]);
            System.out.println(datos[0][1]);
            System.out.println(datos[0][2]);
            System.out.println(datos[0][3]);
            System.out.println(datos[1][0]);
            System.out.println(datos[1][1]);
            System.out.println(datos[1][2]);
            System.out.println(datos[1][3]);
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