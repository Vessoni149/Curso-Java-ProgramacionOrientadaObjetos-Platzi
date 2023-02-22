package model;

public class Nurse extends User{
    private String scpeciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriologia, pediatria.");
    }

    public String getScpeciality() {
        return scpeciality;
    }

    public void setScpeciality(String scpeciality) {
        this.scpeciality = scpeciality;
    }
}
