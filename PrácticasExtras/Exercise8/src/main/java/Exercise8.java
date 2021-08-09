public class Exercise8 {
    //Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";

        //First way
        System.out.println(hi+mom);

        //Second way
        String saludo = hi.concat(mom);
        System.out.println(saludo);
    }
}
