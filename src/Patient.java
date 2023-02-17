public class Patient {
    int id;
    private String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;  //private va a hacer que este dato solo sea accesible dentro de esta clase
    private double height;
    String blood;
    Patient(String name, String email){
    this.name = name;
    this.email = email;
    this.weight = 54.4;
        //System.out.println(weight + " kg."); //esto se va a ejecutar al crear el objeto (instanciar la clase).
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
       return phoneNumber;  //si el numero es mayor va a retornar null porque es el valor por defecto de un string no asignado.

    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número debe ser de 8 digitos máximo.");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
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
