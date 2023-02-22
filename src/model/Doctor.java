package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //static int id = 0; //cada vez que se cree una instancia de esta clase doctor, id deberia autoincrementarse.
    //Las variables static no pertenecen al objeto sino a la clase, si se modifica la variable static esto se
    // verá reflejado en todos los objetos que hayan sido creados con esa clase.
    //Utilizaremos static para llamar a esta variable utilizar al objeto.
   String speciality;

   //model.Doctor(){    //metodo constructor
       //System.out.println("construyenco al objeto model.Doctor");
       //id++;           //cava vez que se instancie model.Doctor (se cree un objeto con esa clase), va a aumentar
       // el id.
   //}
    //El sin constructor parametros existe por defecto, Java crea un constructor por defecto si no hemos
    // definido ninguno en la clase, pero si en una clase definimos un constructor ya no se crea
    // automáticamente el constructor por defecto, por lo mismo este se considera que siempre debe existir
    // para un programador, y asi mismo un segundo constructor con parametros, usualmente con todos
    // su atributos inicializados,
   //Sobrecarga de Cosntructores:
    //A veces necesitamos que 2 o mas metodos tengan el mismo nombre pero sus argumentos sean diferentes,
    // varien en cantidad o incluso que el metodo retorne otro valor diferente o simplemente retorne algo
    // si no retornaba nada.
    //EJ:
                           //public class Calculadora {
                               // Los dos parámetros y el valor de retorno son de tipo int
                               //public int suma(int a, int b) {
                               //    return a + b;
                               //}

                               // Los dos parámetros y el valor de retorno son de tipo float
                               //public float suma(float a, float b) {
                               //    return a + b;
                               //}

                               // Un parámetro es de tipo int, mientras que el otro parámetro
                               // y el valor de retorno son de tipo float
                               //public float suma(int a, float b) {
                               //    return a + b;
                               //}
                            //  }
//Los constructores tambien se pueden sobrecargar. Ej, aca tenemos un metodo constructor model.Doctor que esta vacio,
// es el que el compiador nos da por defecto auntque ni lo escribamos.
// Nosotros podriamos crear otro metodo constructor model.Doctor y agregarle parametros para que cuando
// inicialicemos un nuevo objeto, "nazca" o se inicialice ya con ciertos valores por defecto. Ej teniendo
// un nombre y una especialidad.
   public Doctor(String name, String email){
       super(name,email);
        //this.name = name;                   //this refiere a los elementos/variables que componen la clase,
       // y se lo asignamos al parametro name para que cuando le pasemos el dato nombre al crear la varaible
       // global no se inicialice por defecto.
        this.speciality = speciality;

   }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailableApponitments(ArrayList<AvailableAppointment> availableApponitments) {
        this.availableApponitments = availableApponitments;
    }
    //public void showName(){
        //System.out.println(name);
    //}
    //public void showId(){
       // System.out.println("ID model.Doctor: " + id);
    //}

    ArrayList<AvailableAppointment> availableApponitments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableApponitments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableApponitments(){
        return availableApponitments;
    }
/*Clases anidadas:
Significa que una clase vivirá dentro de otra. Una se llamará clase exterior y la otra clase anidada.
Las clases anidadas son de 2 tipos:
1 Internas (no tienen static) y  2 estáticas anidadas (tienen static).
Las  1 internas pueden ser de 2 tipos:
a- Locales a un método (una clase dentro de un método)
b-Internas anónimas (se ven más en programación funcional).

Para las 2 estáticas no se necesita crear instancia (objeto) para llamarlas. Igual que una clase static
cualquiera, por su naturaleza de static Solo vamos a poder llamar a los métodos que sean estáticos.
Para el resto de las clases anidadas pueden llamar cualquier tipo de elemento o método.
**/

    @Override
    public String toString() {
        return super.toString() + " Speciality: "+ speciality+ "Available: "+ availableApponitments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Cruz Roja");
        System.out.println("Departamento oncologia");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        //SimpleDateFormat cambia de string a objeto date.

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
        return date;
        }
        //vamos a sobrecargar el metodo getDate, para  que tomando un string devuelva un objeto date.
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
        return "Available Appointments Date: " + date+ "Time: " +time;
    }
    }


    //Clases interna o no estaticas:
    //en ambos tipos: el scope de esta clase estara definido al metodo, para acceder al metodo habra que crear un objeto del tipo de esa clase.



}
