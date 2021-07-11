package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    //va hacer la interfaz de las oociones del doctor

    //para almacenar las citas del doctor
    public static ArrayList<Doctor> doctorsAvailableAppoinments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.doctorLogged.getName());
            System.out.println("1.- Add Available Appoinment");
            System.out.println("2.- My Scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());


            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while(response != 0);
    }

    //para agregar una cita
    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Moth");
            for (int i = 0; i < 3; i++) {//para mostrar los meses
                int j = i +1;
                System.out.println(j+". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <4){
                //1, 2, 3
                int monthSlected = response;
                System.out.println(monthSlected+". "+UIMenu.MONTHS[monthSlected-1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+date+"\n1. correct \n2.Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {//aqui se almacenan las fechas
                    System.out.println("Insert the time available for date: "+date+" [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: "+ time +"\n1. Correc \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppontments(UIMenu.doctorLogged);


            }else if (response == 0){
                showDoctorMenu();
            }

        }while (response != 0);
    }
    //para validar que el doctor tenga citas
    private static void checkDoctorAvailableAppontments(Doctor doctor){
        if(doctor.getAvailableAppointments().size()> 0
                && !doctorsAvailableAppoinments.contains(doctor)){
            doctorsAvailableAppoinments.add(doctor);
        }
    }
}
