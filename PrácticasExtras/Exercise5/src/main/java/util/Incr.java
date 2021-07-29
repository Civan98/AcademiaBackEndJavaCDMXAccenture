package util;

public class Incr {
    public static void main(String[] args) {
        
        //Resultado 33
        Integer x = 7;
        int y = 2;

        x *= x; 
        y *= y;
        y *= y;
        x -= y;

        System.out.println(x);
        //System.out.println(y);
    }
}
