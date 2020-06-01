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
        
        int contador;
        int fila;

        try {
            archivo = new File("/Users/carlosmesa/Documents/Universidad/5SEMESTRE/Organizacion de computadores/Practica final/Codigo/TiroAlBlanco/paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
            lector = new FileReader(archivo);
            br = new BufferedReader(lector);

            fila = 0;
            contador = 0;
            double datos[][] = new double[1116772][4]; 

            while((linea = br.readLine()) != null) {
                cadena_particionada = linea.split(";");
                contador++;
                for(int i=2; i<=5; i++) {
                    datos[fila][i-2] = Double.parseDouble(cadena_particionada[i]);
                }
                fila ++;
            }
            System.out.println(contador);
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