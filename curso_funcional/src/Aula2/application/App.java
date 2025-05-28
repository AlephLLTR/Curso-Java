package Aula2.application;

import java.util.Arrays;

public class App {

    public static int globalValue = 3;
    public static void main(String[] args) {

        int[] vect = new int[] { 3, 4, 5 };

        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));

    }

    public static void changeOddValues(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 != 0) {
                vect[i] += globalValue;
            }
        }
    }
}
