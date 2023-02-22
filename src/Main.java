import model.Patient;
import model.User;

import static UI.UIMenu.showMenu;

public class Main {
        public static void main(String[] args) {
                showMenu();

        //model.Doctor myDoctor = new model.Doctor(); //model.Doctor() es el llamado al metodo constructor, se compone de el
        // nombre de la clase y (). No hace falta declararlo ni importarlo acá. En nuestra clase model.Doctor
        // creamos el constructor, pero si no lo hubiesemos creado, el compilador de java entiende que
        // existe por defecto solo por ser una clase. El uso de este metodo constructor nos permite crear
        // instancias de una clase como estamos haciendo aca. Para crear una instancia de la clase:
        // new MetodoConstructor().
        // Puede contener argumentos. No regresa ningun valor.
        //myDoctor.name = "Alejandro Rodriguez";
        //Acceder a metodos, hay 2 formas, la primera:
        //es a traves de una instancia de la clase (a traves del objeto), usando el metodo de la clase.
        //myDoctor.showName();
        //myDoctor.showId();
        //myDoctor es un objeto (instancia de la clase model.Doctor) y a atraves del objeto myDoctor llamamos
        // al metodo creado en la clase model.Doctor.
        //la segundda:
        //llamar directamente el metodo (o variable en este caso) de la Clase y no desde la instancia u objeto.
        //System.out.println(model.Doctor.id);
        //Para poder hacer esto es necesario que el metodo o variable de la Clase sea static.
        //1) Las variables/metodos estáticas también se conocen como variables/metodos de clase.
        //2) Cuando  "static"  se aplica a una variable/metodo, significa que esta/e pertenece a
        // la clase y no a una instancia de la clase.
        //3) Se puede acceder a una variable/metodo estático directamente usando el nombre de la clase sin
        // instanciar la clase en la que están definidas. Osea, sirve para poder acceder al metodo/variable
        // de la clase, si crear una instancia (objeto) de ella.

        // el scope de los variables static es asi:
        //una clase A puede crear la variable,
        //una clase B puede alterar ese valor de la variable,
        //Y una clase c puede imprimir el nuevo valor de la variable.
        //la variable estatica mantiene su ciclo de vida durante todo el programa.
        //model.Doctor myDoctorAnn = new model.Doctor();
        //otra forma de mostrar el id:
       //System.out.println(myDoctorAnn.id);
            //UIMenu.showMenu();

        //model.Doctor doctor3 = new model.Doctor("Pedro Lopez", "pediatra");
        //Al crear la instancia solo hay que escribir los parametros, NO LOS TIPOS DE DATO, sino va a tirar
        // error. Los tipos de
        // datos se asignan AUTOMATICAMENTE al escrivir el valor.
        //System.out.println(doctor3.name);
        //System.out.println(doctor3.speciality);

        //Patient patient = new Patient("Alejandra", "Alejandra@mail.com");
                //System.out.println(patient.name);
        //patient.address = "Av. las Américas 456";
        //Esta variable puede ser modificada desde aca, en la Clase Main. Esto depende de los modificadores
        //de acceso. Por defecto si no se le pone nada es "default".
        //Existen 4 modificadores de acceso, c/u da distintos permisos para acceder y cambiar sus variables:
                //public        da acceso a: clase, package, subclase, otros.
                //protected     da acceso a: clase, package, subclase.
                //default       da acceso a: clase, package,
                //private       da acceso a: clase
        //System.out.println(patient.address);

        //patient.setWeight(54.4);
        //System.out.println(patient.getWeight());
        //patient.setPhoneNumber("23523623632623");
        //System.out.println(patient.getPhoneNumber());

        //myDoctorAnn.addAvailableAppointment(new Date(), "4pm");
        //myDoctorAnn.addAvailableAppointment(new Date(), "6pm");
        //myDoctorAnn.addAvailableAppointment(new Date(), "8pm");
                //for (model.Doctor.AvailableAppointment aA: myDoctorAnn.getAvailableApponitments()){
               //         System.out.println(aA.getDate() + " " + aA.getTime());
               // }

                //POLIMORFISMO:
                //posibilidad de sobreescribir un metodo con comportamientos diferentes.
                //sirve para que por ej una clase hija haga algo distinto de lo que hace su clase padre con un metodo.
        //sobreescritura de metodos:
         // los marcados con final no se pueden sobreescribir, los otros si.
        //System.out.println(patient);
        //User userPa = new Patient("Anahí", "asd@gmail.com");
        //userPa.showDataUser();

        //puedo isntanciar una clase abstracta con una clase anonima.
        //User user1 = new User("Anahi", "Salgado") {
                //@Override
               // public void showDataUser() {
                //        System.out.println("Doctor");
               //         System.out.println("Hospital Cruz verde");
                //}
        //};
       // user1.showDataUser();


        }
    /*Cuando asignamos un objeto a otro, es decir "objeto1 = objeto2", no es lo mismo que asignar una
    variable a otra. En el caso del objeto lo que sucede es que el objeto1 va a apuntar al espacio en
    memoria que esta ocupando el objeto2. Ambos objetos ahora van a apuntar al mismo lugar, entonces si
    imprimimos objeto1 y objeto2 van a mostrar los mismos datos.
    Con las variables en cambio, si se sobreescribe el espacio en memoria. Es la ppal dif entre objetos y
    variables.*/

}