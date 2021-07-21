package util;

public class Bottom2 extends Top{

    /*
        Marca error porqué primero en un contructor de una subclase primero
        se debe hacer referencia al constructor de la clase padre con la
        palabra reservada [SUPER]

    */
    public Bottom2( String s){
        // Se soluciona con la siguiente linea de código
        //super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}
