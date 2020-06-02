import java.util.Scanner;

// Esta clase es la clase principal que se encarga de seleccionar que punto se va a ejectutar.
public class Core {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para ejecutar el programa tienes 3 opciones de ejecución:");
        System.out.println("Ingresar el número 1 : Punto A");
        System.out.println("Ingresar el número 2 : Punto B");
        System.out.println("Ingresar el número 3 : Punto C");
        System.out.print("Tu opción es: ");
        int seleccion = sc.nextInt();                       // Scanner que espera una respuesta del usuario para proceder a ejecutar el codigo.
        sc.close();
        Lector lector = new Lector();                       // Nueva instancia de Lector.
        long tamaño = lector.getTamaño();                   // Obtenemos el tamaño del archivo que se esta leyendo.
        double [][] valores = new double [(int)tamaño][4];  // Se crea y se inicializa una matriz del tamaño requerido para guardar los datos.
        double [] max_min = new double [8];                 // Se crea y se inicializa un arreglo para guardar los datos maximos y los minimos.
        Procesador procesador = new Procesador();           // Se inicializa y se crea un nuevo objeto procesador.

        // Si se selecciona el Punto A, Se lee el archvo, se guardan los valores,
        // se procesan para saber cual es el mayor y menor de cada columna y por
        // ultimo se imprimen los resultados.
        if (seleccion == 1){
            long inicio = System.currentTimeMillis();
            valores = lector.lectura("DAT_ASCII_EURUSD_M1_2017_2019.csv");
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

        // Si se selecciona el punto B, Se crean 20 hilos y cada uno lee una parte del archivo,
        // guarda los valores en un array, luego cada uno de ellos procesa los datos para
        // devolver los maximos y los minimos de la parte del archivo que les corresponde,
        // por ultimo se llama a la clase optimizador para que compare los datos de los hilos
        // y retorne el maximo y el minimo del archivo completo.
        else if(seleccion == 2){
            long inicioPro = System.currentTimeMillis();

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

            int numero_hilos = 20;
            int x = (int)tamaño/numero_hilos;

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
            MultiProcesador t20 = new MultiProcesador((x * 19) + 1, (int)tamaño , x * 19);

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

            Optimizador opti = new Optimizador();
            opti.optimizarMax(t1.max1,t2.max1,t3.max1,t4.max1,t5.max1,t6.max1,
                t7.max1,t8.max1,t9.max1,t10.max1,t11.max1,t12.max1,t13.max1,
                t14.max1,t15.max1,t16.max1,t17.max1,t18.max1,t19.max1,t20.max1,
                "uno");

            opti.optimizarMin(t1.min1,t2.min1,t3.min1,t4.min1,t5.min1,t6.min1,
                t7.min1,t8.min1,t9.min1,t10.min1,t11.min1,t12.min1,t13.min1,
                t14.min1,t15.min1,t16.min1,t17.min1,t18.min1,t19.min1,t20.min1,
                "uno");

            opti.optimizarMax(t1.max2,t2.max2,t3.max2,t4.max2,t5.max2, 
                t6.max2,t7.max2,t8.max2,t9.max2,t10.max2,t11.max2,t12.max2, 
                t13.max2,t14.max2,t15.max2,t16.max2,t17.max2,t18.max2,t19.max2,t20.max2,
                "dos");
            
            opti.optimizarMin(t1.min2,t2.min2,t3.min2,t4.min2,t5.min2,t6.min2,
                t7.min2,t8.min2,t9.min2,t10.min2,t11.min2,t12.min2,t13.min2,
                t14.min2,t15.min2,t16.min2,t17.min2,t18.min2,t19.min2,t20.min2,
                "dos");

            opti.optimizarMax(t1.max3,t2.max3,t3.max3,t4.max3,t5.max3,t6.max3,
                t7.max3,t8.max3,t9.max3,t10.max3,t11.max3,t12.max3,t13.max3,
                t14.max3,t15.max3,t16.max3,t17.max3,t18.max3,t19.max3,t20.max3,
                "tres");
            
            opti.optimizarMin(t1.min3,t2.min3,t3.min3,t4.min3,t5.min3,t6.min3,
                t7.min3,t8.min3,t9.min3,t10.min3,t11.min3,t12.min3,t13.min3,
                t14.min3,t15.min3,t16.min3,t17.min3,t18.min3,t19.min3,t20.min3,
                "tres");

            opti.optimizarMax(t1.max4,t2.max4,t3.max4,t4.max4,t5.max4, 
                t6.max4,t7.max4,t8.max4,t9.max4,t10.max4,t11.max4,t12.max4, 
                t13.max4,t14.max4,t15.max4,t16.max4,t17.max4,t18.max4,t19.max4,t20.max4,
                "cuatro");
                           
            opti.optimizarMin(t1.min4,t2.min4,t3.min4,t4.min4,t5.min4,t6.min4,
                t7.min4,t8.min4,t9.min4,t10.min4,t11.min4,t12.min4,t13.min4,
                t14.min4,t15.min4,t16.min4,t17.min4,t18.min4,t19.min4,t20.min4,
                "cuatro");

            System.out.println(System.currentTimeMillis() - inicioPro + " milisegundos");
        }

        // Si se selecciona el punto C, Se crea un hilo principal para que lea todo el archivo
        // y lo particione en la cantidad de hilos secundarios (20) para que estos hilos se 
        // encarguen de procesar esta informacion para saber cual es el maximo y cual es el 
        // minimo de cada una de las columnas y los retorne en una matriz de subresultados
        // y luego se le pasa esta matriz al procesador para que analice cual de todos los
        // valores es el mayor y el menor para cada una de las columnas, luego
        // retorna estos valores y finalmente imprime estos resultados.
        else if(seleccion == 3){
            long inicio = System.currentTimeMillis();
            TPrincipal rey = new TPrincipal();
            rey.start();
            rey.join();
            valores = rey.valores;
            int numero_hilos = 20;
            int x = (int)tamaño/numero_hilos;

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
            TSecundario t20 = new TSecundario(valores, (x*19)+1, (int)tamaño);
            
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

        // En caso de no seleccionar ningun valor valido (1,2,3) se imprime un mensaje de error
        else {
            System.out.println("ERROR: NO Ingreso uno de los 3 números");
            System.exit(1);
        }

    }
}