package util;

public class PrePostDemo {
    public static void main(String[] args){

        int i = 3;

        i++;

        System.out.println(i);    // "4"

        ++i;

        System.out.println(i);    // "5"
        /*
            En esta parte el 6 se imprime dos veces debido a que en la segunda impreción a consola primero
            se evalua el valor de i y luego se incrementa en uno.
         */

        System.out.println(++i);  // "6"

        System.out.println(i++);  // "6"

        System.out.println(i);    // "7"

    }
}
