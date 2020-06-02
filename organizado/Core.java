package organizado;

import java.util.Scanner;

public class Core {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para ejecutar el programa tienes 3 opciones de ejecución:");
        System.out.println("Ingresar el número 1 : Punto A");
        System.out.println("Ingresar el número 2 : Punto B");
        System.out.println("Ingresar el número 3 : Punto C");
        System.out.print("Tu opción es: ");
        int seleccion = sc.nextInt();
        double [][] valores = new double [1116772][4];
        double [] max_min = new double [8];
        Lector lector = new Lector();
        Procesador procesador = new Procesador();
        if (seleccion == 1){
            long inicio = System.currentTimeMillis();
            valores = lector.lectura("C:/cygwin64/home/spulgarinv/st0254/254sspulgarinv/Nand2Tetris/nand2tetris/tools/TiroAlBlanco/Paralelismo/DAT_ASCII_EURUSD_M1_2017_2019.csv");
            max_min = procesador.procesar(valores);
            System.out.println("El maximo de la columna uno es:"+max_min[0]+'\n'+
            "El minimo de la columna uno es:"+max_min[1]+'\n'+
            "El maximo de la columna uno es:"+max_min[2]+'\n'+
            "El minimo de la columna uno es:"+max_min[3]+'\n'+
            "El maximo de la columna uno es:"+max_min[4]+'\n'+
            "El minimo de la columna uno es:"+max_min[5]+'\n'+
            "El maximo de la columna uno es:"+max_min[6]+'\n'+
            "El minimo de la columna uno es:"+max_min[7]);
            System.out.println(System.currentTimeMillis()-inicio + " milisegundos");
            
        }
        else if(seleccion == 2){
            long inicio = System.currentTimeMillis();
            int x = 55830;
            MultiProcesador t1 = new MultiProcesador(0, x);
            MultiProcesador t2 = new MultiProcesador(x+1, x*2);
            MultiProcesador t3 = new MultiProcesador((x*2)+1, x*3);
            MultiProcesador t4 = new MultiProcesador((x*3)+1, x*4);
            MultiProcesador t5 = new MultiProcesador((x*4)+1, x*5);
            MultiProcesador t6 = new MultiProcesador((x*5)+1, x*6);
            MultiProcesador t7 = new MultiProcesador((x*6)+1, x*7);
            MultiProcesador t8 = new MultiProcesador((x*7)+1, x*8);
            MultiProcesador t9 = new MultiProcesador((x*8)+1, x*9);
            MultiProcesador t10 = new MultiProcesador((x*9)+1, x*10);
            MultiProcesador t11 = new MultiProcesador((x*10)+1, x*11);
            MultiProcesador t12 = new MultiProcesador((x*11)+1, x*12);
            MultiProcesador t13 = new MultiProcesador((x*12)+1, x*13);
            MultiProcesador t14 = new MultiProcesador((x*13)+1, x*14);
            MultiProcesador t15 = new MultiProcesador((x*14)+1, x*15);
            MultiProcesador t16 = new MultiProcesador((x*15)+1, x*16);
            MultiProcesador t17 = new MultiProcesador((x*16)+1, x*17);
            MultiProcesador t18 = new MultiProcesador((x*17)+1, x*18);
            MultiProcesador t19 = new MultiProcesador((x*18)+1, x*19);
            MultiProcesador t20 = new MultiProcesador((x*19)+1, 1116772);

            t1.start(); t2.start(); t3.start(); t4.start();
            t5.start(); t6.start(); t7.start(); t8.start();
            t9.start(); t10.start(); t11.start(); t12.start();
            t13.start(); t14.start(); t15.start(); t16.start();
            t17.start(); t18.start(); t19.start(); t20.start(); 

            t1.join(); t2.join(); t3.join(); t4.join();
            t5.join(); t6.join(); t7.join(); t8.join();
            t9.join(); t10.join(); t11.join(); t12.join();
            t13.join(); t14.join(); t15.join(); t16.join();
            t17.join(); t18.join(); t19.join(); t20.join();
            double [][] subresultados = new double [20][8];
            int j;
            MultiProcesador [] elmulti = new MultiProcesador[20];

            elmulti[0] = t1; elmulti[1] = t2; elmulti[2] = t3;
            elmulti[3] = t4; elmulti[4] = t5; elmulti[5] = t6;
            elmulti[6] = t7; elmulti[7] = t8; elmulti[8] = t9;
            elmulti[9] = t10; elmulti[10] = t11; elmulti[11] = t12;
            elmulti[12] = t13; elmulti[13] = t14; elmulti[14] = t15;
            elmulti[15] = t16; elmulti[16] = t17; elmulti[17] = t18;
            elmulti[18] = t19; elmulti[19] = t20;

            for (int i = 0; i < subresultados.length; i++) {
                j = 0;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
                j++;
                subresultados [i][j] =  elmulti[i].subresultados[j];
            }
            Procesador comparador = new Procesador();
            comparador.procesar(subresultados);
        }
        else if(seleccion == 3){

        }
        else {
            System.out.println("ERROR: NO Ingreso uno de los 3 números");
            System.exit(1);
        }

    }
}