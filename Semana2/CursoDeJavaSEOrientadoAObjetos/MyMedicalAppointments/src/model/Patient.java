package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    //para almacenar las citas con el doctor
    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    //Metodo constructor
    public Patient(String name, String email){
        super(name,email);
    }

    //Getters and Setters
    //54.4
    public void setWeigth(double weight){
        this.weight = weight;
    }

    //54.5 kg. String
    public String getWeight(){
        return this.weight + " kg.";
    }

    public String getHeight() {
        return height+" Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nAge: "+birthday+" \n Weight: "+getWeight()+"\n Height: "+getHeight()+"\n Blood: "+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}
