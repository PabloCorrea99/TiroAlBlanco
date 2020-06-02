package TiroAlBlanco.organizado;

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
            valores = lector.lectura("C:\\Users\\Usuario\\Desktop\\5 SEMESTRE\\Proyecto Final Org\\TiroAlBlanco\\paralelismo\\DAT_ASCII_EURUSD_M1_2017_2019.csv");
            max_min = procesador.procesar(valores);
            System.out.println("El maximo de la columna uno es:"+max_min[0]+'\n'+
            "El minimo de la columna uno es:"+max_min[1]+'\n'+
            "El maximo de la columna dos es:"+max_min[2]+'\n'+
            "El minimo de la columna dos es:"+max_min[3]+'\n'+
            "El maximo de la columna tres es:"+max_min[4]+'\n'+
            "El minimo de la columna tres es:"+max_min[5]+'\n'+
            "El maximo de la columna cuatro es:"+max_min[6]+'\n'+
            "El minimo de la columna cuatro es:"+max_min[7]);
            System.out.println(System.currentTimeMillis()-inicio + " milisegundos");
            
        }
        else if(seleccion == 2){
        /*
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
            */
            int x = 55830;
        double numeros1max[], numeros2max[], numeros3max[], numeros4max[];
        double numeros1min[], numeros2min[], numeros3min[], numeros4min[];
        numeros1max = new double[20];
        numeros2max = new double[20];
        numeros3max = new double[20];
        numeros4max = new double[20];
        numeros1min = new double[20];
        numeros2min = new double[20];
        numeros3min = new double[20];
        numeros4min = new double[20];


        long inicioPro = System.currentTimeMillis();

        MultiProcesador t1 = new MultiProcesador(2, x, 0);
        MultiProcesador t2 = new MultiProcesador(x + 1, (2 * x), x);
        MultiProcesador t3 = new MultiProcesador((x * 2) + 1, (3 * x), x * 2);
        MultiProcesador t4 = new MultiProcesador((x * 3) + 1, (4 * x), x * 3);
        MultiProcesador t5 = new MultiProcesador((x * 4) + 1, (5 * x), x * 4);
        MultiProcesador t6 = new MultiProcesador((x * 5) + 1, (6 * x), x * 5);
        MultiProcesador t7 = new MultiProcesador((x * 6) + 1, (7 * x), x * 6);
        MultiProcesador t8 = new MultiProcesador((x * 7) + 1, (8 * x), x * 7);
        MultiProcesador t9 = new MultiProcesador((x * 8) + 1, (9 * x), x * 8);
        MultiProcesador t10 = new MultiProcesador((x * 9) + 1, (10 * x), x * 9);
        MultiProcesador t11 = new MultiProcesador((x * 10) + 1, (11 * x), x * 10);
        MultiProcesador t12 = new MultiProcesador((x * 11) + 1, (12 * x), x * 11);
        MultiProcesador t13 = new MultiProcesador((x * 12) + 1, (13 * x), x * 12);
        MultiProcesador t14 = new MultiProcesador((x * 13) + 1, (14 * x), x * 13);
        MultiProcesador t15 = new MultiProcesador((x * 14) + 1, (15 * x), x * 14);
        MultiProcesador t16 = new MultiProcesador((x * 15) + 1, (16 * x), x * 15);
        MultiProcesador t17 = new MultiProcesador((x * 16) + 1, (17 * x), x * 16);
        MultiProcesador t18 = new MultiProcesador((x * 17) + 1, (18 * x), x * 17);
        MultiProcesador t19 = new MultiProcesador((x * 18) + 1, (19 * x), x * 18);
        MultiProcesador t20 = new MultiProcesador((x * 19) + 1, 1116772 , x * 19);

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
        double max1, max2, max3, max4;
        double min1, min2, min3, min4;
        max1 = 0;
        max2 = 0;
        max3 = 0;
        max4 = 0;
        min1 = 10.0;
        min2 = 10.0;
        min3 = 10.0;
        min4 = 10.0;

        numeros1max [0] = t1.max1;
        numeros1max [1] = t2.max1;
        numeros1max [2] = t3.max1;
        numeros1max [3] = t4.max1;
        numeros1max [4] = t5.max1;
        numeros1max [5] = t6.max1;
        numeros1max [6] = t7.max1;
        numeros1max [7] = t8.max1;
        numeros1max [8] = t9.max1;
        numeros1max [9] = t10.max1;
        numeros1max [10] = t11.max1;
        numeros1max [11] = t12.max1;
        numeros1max [12] = t13.max1;
        numeros1max [13] = t14.max1;
        numeros1max [14] = t15.max1;
        numeros1max [15] = t16.max1;
        numeros1max [16] = t17.max1;
        numeros1max [17] = t18.max1;
        numeros1max [18] = t19.max1;
        numeros1max [19] = t20.max1; 

        for (int j = 0; j < numeros1max.length; j++) {
            if ( numeros1max[j]> max1)
                max1 = numeros1max[j];
        }

        numeros2max [0] = t1.max2;
        numeros2max [1] = t2.max2;
        numeros2max [2] = t3.max2;
        numeros2max [3] = t4.max2;
        numeros2max [4] = t5.max2;
        numeros2max [5] = t6.max2;
        numeros2max [6] = t7.max2;
        numeros2max [7] = t8.max2;
        numeros2max [8] = t9.max2;
        numeros2max [9] = t10.max2;
        numeros2max [10] = t11.max2;
        numeros2max [11] = t12.max2;
        numeros2max [12] = t13.max2;
        numeros2max [13] = t14.max2;
        numeros2max [14] = t15.max2;
        numeros2max [15] = t16.max2;
        numeros2max [16] = t17.max2;
        numeros2max [17] = t18.max2;
        numeros2max [18] = t19.max2;
        numeros2max [19] = t20.max2;

        for (int j = 0; j < numeros2max.length; j++) {
            if ( numeros2max[j]> max2)
                max2 = numeros2max[j];
        }

        numeros3max [0] = t1.max3;
        numeros3max [1] = t2.max3;
        numeros3max [2] = t3.max3;
        numeros3max [3] = t4.max3;
        numeros3max [4] = t5.max3;
        numeros3max [5] = t6.max3;
        numeros3max [6] = t7.max3;
        numeros3max [7] = t8.max3;
        numeros3max [8] = t9.max3;
        numeros3max [9] = t10.max3;
        numeros3max [10] = t11.max3;
        numeros3max [11] = t12.max3;
        numeros3max [12] = t13.max3;
        numeros3max [13] = t14.max3;
        numeros3max [14] = t15.max3;
        numeros3max [15] = t16.max3;
        numeros3max [16] = t17.max3;
        numeros3max [17] = t18.max3;
        numeros3max [18] = t19.max3;
        numeros3max [19] = t20.max3;

        for (int j = 0; j < numeros3max.length; j++) {
            if ( numeros3max[j]> max3)
                max3 = numeros3max[j];
        }

        numeros4max [0] = t1.max4;
        numeros4max [1] = t2.max4;
        numeros4max [2] = t3.max4;
        numeros4max [3] = t4.max4;
        numeros4max [4] = t5.max4;
        numeros4max [5] = t6.max4;
        numeros4max [6] = t7.max4;
        numeros4max [7] = t8.max4;
        numeros4max [8] = t9.max4;
        numeros4max [9] = t10.max4;
        numeros4max [10] = t11.max4;
        numeros4max [11] = t12.max4;
        numeros4max [12] = t13.max4;
        numeros4max [13] = t14.max4;
        numeros4max [14] = t15.max4;
        numeros4max [15] = t16.max4;
        numeros4max [16] = t17.max4;
        numeros4max [17] = t18.max4;
        numeros4max [18] = t19.max4;
        numeros4max [19] = t20.max4;

        for (int j = 0; j < numeros4max.length; j++) {
            if ( numeros4max[j]> max4)
                max4 = numeros4max[j];
        }

        numeros1min [0] = t1.min1;
        numeros1min [1] = t2.min1;
        numeros1min [2] = t3.min1;
        numeros1min [3] = t4.min1;
        numeros1min [4] = t5.min1;
        numeros1min [5] = t6.min1;
        numeros1min [6] = t7.min1;
        numeros1min [7] = t8.min1;
        numeros1min [8] = t9.min1;
        numeros1min [9] = t10.min1;
        numeros1min [10] = t11.min1;
        numeros1min [11] = t12.min1;
        numeros1min [12] = t13.min1;
        numeros1min [13] = t14.min1;
        numeros1min [14] = t15.min1;
        numeros1min [15] = t16.min1;
        numeros1min [16] = t17.min1;
        numeros1min [17] = t18.min1;
        numeros1min [18] = t19.min1;
        numeros1min [19] = t20.min1;

        for (int j = 0; j < numeros1min.length; j++) {
            if ( numeros1min[j]<min1 )
                min1 = numeros1min[j];
        }

        numeros2min [0] = t1.min2;
        numeros2min [1] = t2.min2;
        numeros2min [2] = t3.min2;
        numeros2min [3] = t4.min2;
        numeros2min [4] = t5.min2;
        numeros2min [5] = t6.min2;
        numeros2min [6] = t7.min2;
        numeros2min [7] = t8.min2;
        numeros2min [8] = t9.min2;
        numeros2min [9] = t10.min2;
        numeros2min [10] = t11.min2;
        numeros2min [11] = t12.min2;
        numeros2min [12] = t13.min2;
        numeros2min [13] = t14.min2;
        numeros2min [14] = t15.min2;
        numeros2min [15] = t16.min2;
        numeros2min [16] = t17.min2;
        numeros2min [17] = t18.min2;
        numeros2min [18] = t19.min2;
        numeros2min [19] = t20.min2;

        for (int j = 0; j < numeros2min.length; j++) {
            if ( numeros2min[j]<min2 )
                min2 = numeros2min[j];
        }

        numeros3min [0] = t1.min3;
        numeros3min [1] = t2.min3;
        numeros3min [2] = t3.min3;
        numeros3min [3] = t4.min3;
        numeros3min [4] = t5.min3;
        numeros3min [5] = t6.min3;
        numeros3min [6] = t7.min3;
        numeros3min [7] = t8.min3;
        numeros3min [8] = t9.min3;
        numeros3min [9] = t10.min3;
        numeros3min [10] = t11.min3;
        numeros3min [11] = t12.min3;
        numeros3min [12] = t13.min3;
        numeros3min [13] = t14.min3;
        numeros3min [14] = t15.min3;
        numeros3min [15] = t16.min3;
        numeros3min [16] = t17.min3;
        numeros3min [17] = t18.min3;
        numeros3min [18] = t19.min3;
        numeros3min [19] = t20.min3; 

        for (int j = 0; j < numeros3min.length; j++) {
            if ( numeros3min[j]<min3 )
                min3 = numeros3min[j];
        }

        numeros4min [0] = t1.min4;
        numeros4min [1] = t2.min4;
        numeros4min [2] = t3.min4;
        numeros4min [3] = t4.min4;
        numeros4min [4] = t5.min4;
        numeros4min [5] = t6.min4;
        numeros4min [6] = t7.min4;
        numeros4min [7] = t8.min4;
        numeros4min [8] = t9.min4;
        numeros4min [9] = t10.min4;
        numeros4min [10] = t11.min4;
        numeros4min [11] = t12.min4;
        numeros4min [12] = t13.min4;
        numeros4min [13] = t14.min4;
        numeros4min [14] = t15.min4;
        numeros4min [15] = t16.min4;
        numeros4min [16] = t17.min4;
        numeros4min [17] = t18.min4;
        numeros4min [18] = t19.min4;
        numeros4min [19] = t20.min4;

        for (int j = 0; j < numeros4min.length; j++) {
            if ( numeros4min[j]<min4 )
                min4 = numeros4min[j];
        }
        
        System.out.println("El maximo de la columna uno es:"+max1+'\n'+
            "El minimo de la columna uno es:"+min1+'\n'+
            "El maximo de la columna dos es:"+max2+'\n'+
            "El minimo de la columna dos es:"+min2+'\n'+
            "El maximo de la columna tres es:"+max3+'\n'+
            "El minimo de la columna tres es:"+min3+'\n'+
            "El maximo de la columna cuatro es:"+max4+'\n'+
            "El minimo de la columna cuatro es:"+min4);
        System.out.println(System.currentTimeMillis() - inicioPro + " milisegundos");

        }
        else if(seleccion == 3){
            long inicio = System.currentTimeMillis();
            TPrincipal rey = new TPrincipal();
            rey.start();
            rey.join();
            valores = rey.valores;
            int x = 55830;

            TSecundario t1 = new TSecundario(valores, 0, x);
            TSecundario t2 = new TSecundario(valores, x+1, x*2);
            TSecundario t3 = new TSecundario(valores, (x*2)+1, x*3);
            TSecundario t4 = new TSecundario(valores, (x*3)+1, x*4);
            TSecundario t5 = new TSecundario(valores, (x*4)+1, x*5);
            TSecundario t6 = new TSecundario(valores, (x*5)+1, x*6);
            TSecundario t7 = new TSecundario(valores, (x*6)+1, x*7);
            TSecundario t8 = new TSecundario(valores, (x*7)+1, x*8);
            TSecundario t9 = new TSecundario(valores, (x*8)+1, x*9);
            TSecundario t10 = new TSecundario(valores, (x*9)+1, x*10);
            TSecundario t11 = new TSecundario(valores, (x*10)+1, x*11);
            TSecundario t12 = new TSecundario(valores, (x*11)+1, x*12);
            TSecundario t13 = new TSecundario(valores, (x*12)+1, x*13);
            TSecundario t14 = new TSecundario(valores, (x*13)+1, x*14);
            TSecundario t15 = new TSecundario(valores, (x*14)+1, x*15);
            TSecundario t16 = new TSecundario(valores, (x*15)+1, x*16);
            TSecundario t17 = new TSecundario(valores, (x*16)+1, x*17);
            TSecundario t18 = new TSecundario(valores, (x*17)+1, x*18);
            TSecundario t19 = new TSecundario(valores, (x*18)+1, x*19);
            TSecundario t20 = new TSecundario(valores, (x*19)+1, 1116772);
            
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

            TSecundario [] hilos = new TSecundario[20];
            hilos[0] = t1; hilos[1] = t2; hilos[2] = t3;
            hilos[3] = t4; hilos[4] = t5; hilos[5] = t6;
            hilos[6] = t7; hilos[7] = t8; hilos[8] = t9;
            hilos[9] = t10; hilos[10] = t11; hilos[11] = t12;
            hilos[12] = t13; hilos[13] = t14; hilos[14] = t15;
            hilos[15] = t16; hilos[16] = t17; hilos[17] = t18;
            hilos[18] = t19; hilos[19] = t20;

            int j;
            for (int i = 0; i < subresultados.length; i++) {
                j = 0;
                subresultados [i][j] =  hilos[i].subresultados[j];
                
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
                j++;
                subresultados [i][j] =  hilos[i].subresultados[j];
            }
            Procesador comparador = new Procesador();
            comparador.procesar(subresultados);
            max_min = procesador.procesar(valores);
            System.out.println("El maximo de la columna uno es:"+max_min[0]+'\n'+
            "El minimo de la columna uno es:"+max_min[1]+'\n'+
            "El maximo de la columna dos es:"+max_min[2]+'\n'+
            "El minimo de la columna dos es:"+max_min[3]+'\n'+
            "El maximo de la columna tres es:"+max_min[4]+'\n'+
            "El minimo de la columna tres es:"+max_min[5]+'\n'+
            "El maximo de la columna cuatro es:"+max_min[6]+'\n'+
            "El minimo de la columna cuatro es:"+max_min[7]);
            System.out.println(System.currentTimeMillis()-inicio + " milisegundos");
        }
        else {
            System.out.println("ERROR: NO Ingreso uno de los 3 números");
            System.exit(1);
        }

    }
}