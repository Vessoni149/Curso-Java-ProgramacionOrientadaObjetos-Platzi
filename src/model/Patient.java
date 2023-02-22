package model;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    String birthday;
    private double weight;  //private va a hacer que este dato solo sea accesible dentro de esta clase
    private double height;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appoinmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppoinmentNurses() {
        return appoinmentNurses;
    }

    public void setAppoinmentNurses(ArrayList<AppointmentNurse> appoinmentNurses) {
        this.appoinmentNurses = appoinmentNurses;
    }

    String blood;
    public Patient(String name, String email){
        super(name, email);                        //super es como this. pero hace referancia a la super clase.
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("historial clinico");
    }

    //getters y setters: permiten leer y escriir los valores de las varaibles, aun que sean privadas.
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){ //siempre que ponga un valor de retorno en vez de void, voy a estar obligado a poenr un return.
        return weight + " kg.";
    }
    public String getHeight() {
        return height + " Mts.";
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



    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

}
