public class Casting {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
 
        //ESIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
        double c = (double) a/b;//tenemos que castearlo para evitar perdida de datos
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);


        /*.::Conversión Automatica::.
byte -> short
short -> int
char -> int
int -> long
long -> float
float -> double

.::Cast Necesario::.
double -> float
float -> long
long -> int
int -> short
short -> byte

char <-> byte
char <-> short
int -> char*/

    }
}
