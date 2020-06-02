package TiroAlBlanco.paralelismo.src;

import java.io.BufferedReader;
import java.io.FileReader;
public class pruebitas {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("TiroAlBlanco/paralelismo/src/DAT_ASCII_EURUSD_M1_2017_2019.csv"));
            String line;
            line = br.readLine();
            int num=line.chars().toArray().length;
            System.out.println(line);
            System.out.println(num);
            br.close();
            // while ((line = br.readLine()) != null) {

            // }
        } catch (Exception e) {
            System.out.println('x');
        }

    }
}

