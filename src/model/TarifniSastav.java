package model;

public class TarifniSastav {

    private int id;
    private String nazivTS;

    public TarifniSastav() {
    }

    public TarifniSastav(int id, String nazivTS) {
        this.id = id;
        this.nazivTS = nazivTS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivTS() {
        return nazivTS;
    }

    public void setNazivTS(String nazivTS) {
        this.nazivTS = nazivTS;
    }

    @Override
    public String toString() {
        return "TarifniSastav{" +
                "id=" + id +
                ", nazivTS='" + nazivTS + '\'' +
                '}';
    }
}
