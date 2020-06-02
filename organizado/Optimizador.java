package organizado;

public class Optimizador {

    public void optimizarMax(double t1,double t2,double t3,double t4,
        double t5,double t6,double t7,double t8,double t9,double t10,
        double t11,double t12,double t13,double t14,double t15,
        double t16,double t17,double t18,double t19,double t20,
        String turno
    )
    {
        double numerosmax[];
        numerosmax = new double[20];
        double max = 0;

        numerosmax [0] = t1;
        numerosmax [1] = t2;
        numerosmax [2] = t3;
        numerosmax [3] = t4;
        numerosmax [4] = t5;
        numerosmax [5] = t6;
        numerosmax [6] = t7;
        numerosmax [7] = t8;
        numerosmax [8] = t9;
        numerosmax [9] = t11;
        numerosmax [10] = t11;
        numerosmax [11] = t12;
        numerosmax [12] = t13;
        numerosmax [13] = t14;
        numerosmax [14] = t15;
        numerosmax [15] = t16;
        numerosmax [16] = t17;
        numerosmax [17] = t18;
        numerosmax [18] = t19;
        numerosmax [19] = t20; 
        
        for (int j = 0; j < numerosmax.length; j++) {
            if ( numerosmax[j]> max)
                max = numerosmax[j];
        }
        System.out.println("El maximo de la columna "+turno+" es:" + max);
    }
public void optimizarMin(double t1,double t2,double t3,double t4,
        double t5,double t6,double t7,double t8,double t9,double t10,
        double t11,double t12,double t13,double t14,double t15,
        double t16,double t17,double t18,double t19,double t20,
        String turno
    )
    {
        double numerosmin[];
        numerosmin = new double[20];
        double min = 10.0;

        numerosmin [0] = t1;
        numerosmin [1] = t2;
        numerosmin [2] = t3;
        numerosmin [3] = t4;
        numerosmin [4] = t5;
        numerosmin [5] = t6;
        numerosmin [6] = t7;
        numerosmin [7] = t8;
        numerosmin [8] = t9;
        numerosmin [9] = t11;
        numerosmin [10] = t11;
        numerosmin [11] = t12;
        numerosmin [12] = t13;
        numerosmin [13] = t14;
        numerosmin [14] = t15;
        numerosmin [15] = t16;
        numerosmin [16] = t17;
        numerosmin [17] = t18;
        numerosmin [18] = t19;
        numerosmin [19] = t20; 
        
        for (int j = 0; j < numerosmin.length; j++) {
            if ( numerosmin[j]< min)
                min = numerosmin[j];
        }
        System.out.println("El maximo de la columna "+turno+" es:" + min);
    }
}