package model;

public abstract class User {
    //una clase abstracta no puede ser instanciada, si heredada.
    //las clases abstractas se apropian de la herencia
    //las clases y metodos abstractos nos va a resolver en nuestro caso de negocio la posibilidad de no tener que instanciar objetos de las clases padre.

    //En el caso de los metodos, si es abstracto, al heredar, sera obligatorio implementarlo.
    //en las clases abstractas solo los metodos que sean abstractos, solo esos seran los unicos que podamos implementar en la calse hija. El resto de los metodos son opcionales, y hasta pueden ser soreescritos.
    //si un metodo es abstracto la clase tambien va a serlo por defecto
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
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
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
            if (phoneNumber.length() > 8){
                System.out.println("El número debe ser de 8 digitos máximo.");
            } else if (phoneNumber.length() == 8) {
                this.phoneNumber = phoneNumber;
        }
    }

    @Override   //Se pueden sobreescribir cosntructores en una subclase al darle al constructor argumentos diferentes que los de la clase padre.
    //En este caso estamos sobreescribiento un metodo de la superclase Object, que todas las clases heredan por default.
    public String toString() {
        return "model.User: " + name + ", Email: " + email + " Addres: "+ address + ". Phone: "+phoneNumber;
    }

    public abstract void showDataUser();
}
