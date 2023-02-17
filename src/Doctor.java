import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //cada vez que se cree una instancia de esta clase doctor, id deberia autoincrementarse.
    //Las variables static no pertenecen al objeto sino a la clase, si se modifica la variable static esto se
    // verá reflejado en todos los objetos que hayan sido creados con esa clase.
    //Utilizaremos static para llamar a esta variable utilizar al objeto.
   String name;
   String email;
   String speciality;

   Doctor(){    //metodo constructor
       //System.out.println("construyenco al objeto Doctor");
       //id++;           //cava vez que se instancie Doctor (se cree un objeto con esa clase), va a aumentar el id.
   }
    //El sin constructor parametros existe por defecto, Java crea un constructor por defecto si no hemos definido ninguno en la clase,
    // pero si en una clase definimos un constructor ya no se crea automáticamente el constructor por defecto, por lo mismo este se
    // considera que siempre debe existir para un programador, y asi mismo un segundo constructor con parametros, usualmente con todos
    // su atributos inicializados,
   //Sobrecarga de Cosntructores:
    //A veces necesitamos que 2 o mas metodos tengan el mismo nombre pero sus argumentos sean diferentes, varien en cantidad o
    // incluso que el metodo retorne otro valor diferente o simplemente retorne algo si no retornaba nada.
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
//Los constructores tambien se pueden sobrecargar. Ej, aca tenemos un metodo constructor Doctor que esta vacio, es el que el
// compiador nos da por defecto auntque ni lo escribamos.
// Nosotros podriamos crear otro metodo constructor Doctor y agregarle parametros para que cuando inicialicemos un nuevo
// objeto, "nazca" o se inicialice ya con ciertos valores por defecto. Ej teniendo un nombre y una especialidad.
   Doctor(String name, String speciality){
        this.name = name;                   //this refiere a los elementos/variables que componen la clase, y se lo asignamos al
       // parametro name para que caundo le pasemos el dato nombre al crear la varaible global no se inicialice por defecto.
        this.speciality = speciality;
   }
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableApponitments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableApponitments.add(new Doctor.AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableApponitments(){
        return availableApponitments;
    }
/*Clases anidadas:
Significa que una clase vivira dentro de otra. Una se llamara clase exterior y la otra clase anidada.
Las clases anidadas son de 2 tipos:
1 Internas (no tienen static) y  2 estáticas anidadas (tienen static).
Las  1 internas pueden ser de 2 tipos:
a- Locales a un metodo (una clase dentro de un metodo)
b-Internas anonimas (se ven mas en programacion funcional).

Para las 2 estaticas no se necesita crear instancia (objeto) para llamarlas. Igual que una clase static cualquiera por su naturaleza de static
Solo vamos a poder llamar a los metodos que sean estaticos.
Para el resto de las clases anidadas puden llamar cualquier tipo de elemento o metodo.
* */
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

    public Date getDate() {
        return date;
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
}
}
