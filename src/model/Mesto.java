package model;

public class Mesto {

    private int id;
    private String naziv;

    public Mesto() {
    }

    public Mesto(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    // opciono equals i hashCode

    @Override
    public String toString() {
        return "Mesto{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
