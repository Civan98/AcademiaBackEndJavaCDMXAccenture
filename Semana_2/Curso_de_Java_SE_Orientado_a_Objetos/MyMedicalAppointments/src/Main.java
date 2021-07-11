import model.*;
import static UI.UIMenu.showMenu;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
      // Se crean los objetos de la clase doctor
       /* model.Doctor myDoctor = new model.Doctor("Maribel torres","lol");
        myDoctor.name = "Ivan Castañeda Contreras";
        myDoctor.showName(); //accede a los metodos de la clase
        myDoctor.showId();
        //System.out.println(model.Doctor.id); Para acceder a la variable estatica de la clase

        //llamada al metodo para mostrar el ID static
        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();*/


        //System.out.println(model.Doctor.id);

        //Para acceder al metodo estatico de la clase UIMenu
        //showMenu();

        //asignando citas a la clase doctor
        //Doctor myDoctor = new Doctor("Ivan", "Otorrinolaringologo");
       // System.out.println(myDoctor.name + " "+ myDoctor.speciality);
        /*myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");*/
        //System.out.println(myDoctor.getAvailableAppointments());

        //implementando una forma de polimorfismo
        /*User user = new Doctor("Raul", "ruli@gmail.com");
        user.showDataUser();

        User userPa = new Patient("carlos","carlin@hotmail.com");
        userPa.showDataUser();*/

        //clases anonimas para instanciar una clase abstracta tienen un ciclo de vida corto
        /*User user1 = new User("Pedro", "pedrin@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: cruz verde");
                System.out.println("Departamento: Geriatría");
            }
        };*/
        //user1.showDataUser(); // manda a traer el metodo para imprimir lo que se guardo

        //interfaces anonimas
       /* ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };*/


        //para imprimir las citas
       /* for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments() ) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }*/
        /*System.out.println(myDoctor);
        Patient patient = new Patient("Estela", "Estelab@gmail.com");
        System.out.println(patient);*/

        //System.out.println(patient.name);//accediendo a los datos del objeto
        //System.out.println(patient.email);

       // patient.weight = 60.5;//kg
       // patient.height = 1.65;//mts.

       // System.out.println(patient.weight);
       // System.out.println(patient.height);

        //implementando los getters and setters
        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("0123456789");// asignando un número de más digitos permitidos*/

        //SE MANDA A TRAER EL METODO MENU QUE ES UN METODO STATIC
        showMenu();
    }
}
