public class Funciones {
    public static void main(String[] args) {  
        double y = 3;

        //Area de un circulo
        //pi * r2
        //System.out.println(Math.PI * Math.pow(y,2));
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2
       // System.out.println(4 * Math.PI * Math.pow(y,2));
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi * r3
       // System.out.println((4/3) * Math.PI * Math.pow(y,3));
        sphereVolumena(y);

        System.out.println("Pesos a Dolares: "+converToDolar(1000, "COP"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumena(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @param quantity Cantidad de dinero
     * @return quantity devuelve la cantidad de dinero actualizada en Dolares
     *
     * */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
