package model;

import java.util.Date;

public class CenaTarife {

    private int id;
    private Date datumTarife;
    private double cenaVT;
    private double cenaMT;

    public CenaTarife() {
    }

    public CenaTarife(int id, Date datumTarife, double cenaVT, double cenaMT) {
        this.id = id;
        this.datumTarife = datumTarife;
        this.cenaVT = cenaVT;
        this.cenaMT = cenaMT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatumTarife() {
        return datumTarife;
    }

    public void setDatumTarife(Date datumTarife) {
        this.datumTarife = datumTarife;
    }

    public double getCenaVT() {
        return cenaVT;
    }

    public void setCenaVT(double cenaVT) {
        this.cenaVT = cenaVT;
    }

    public double getCenaMT() {
        return cenaMT;
    }

    public void setCenaMT(double cenaMT) {
        this.cenaMT = cenaMT;
    }

    @Override
    public String toString() {
        return "CenaTarife{" +
                "id=" + id +
                ", datumTarife=" + datumTarife +
                ", cenaVT=" + cenaVT +
                ", cenaMT=" + cenaMT +
                '}';
    }
}
