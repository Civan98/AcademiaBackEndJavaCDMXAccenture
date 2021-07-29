package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //constructor
    public Doctor(String name, String email){
        super(name,email);
        //System.out.println("El nombre del model.Doctor asignado es: " + name);
       // this.speciality = speciality;
    }

    //getter and setter
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
   /* public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID: model.Doctor "+id);
    }*/


    public void addAvailableAppointment(String date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments (){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+speciality+"\nAvailable: "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");

    }

    //clase anidada estatica
    public static class AvailableAppointment{
        private int id_availableAppoinment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //Avilable Appointment

        //metodo constructor de la clase anidada
        public AvailableAppointment(String date, String time){
            try {//para controlar errores
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId_availableAppoinment() {
            return id_availableAppoinment;
        }

        public void setId_availableAppoinment(int id_availableAppoinment) {
            this.id_availableAppoinment = id_availableAppoinment;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments\nDate: "+date+"\nTime: "+time;
        }
    }

}
