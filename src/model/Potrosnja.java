package model;

import java.util.Date;

public class Potrosnja {
    private int pretplatnikID;
    private Date datumCitanja;
    private Date datumOd;
    private Date datumDo;
    private double novoStanjeVT;
    private double novoStanjeMT;
    private double fiksniDeoKW;
    private int cenaTarifeID;
    private Date datumTarife;

    public Potrosnja() {
    }

    public Potrosnja(
            int pretplatnikID,
            Date datumCitanja,
            Date datumOd,
            Date datumDo,
            double novoStanjeVT,
            double novoStanjeMT,
            double fiksniDeoKW,
            int cenaTarifeID,
            Date datumTarife
    ) {
        this.pretplatnikID = pretplatnikID;
        this.datumCitanja = datumCitanja;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.novoStanjeVT = novoStanjeVT;
        this.novoStanjeMT = novoStanjeMT;
        this.fiksniDeoKW = fiksniDeoKW;
        this.cenaTarifeID = cenaTarifeID;
        this.datumTarife = datumTarife;
    }

    public int getPretplatnikID() {
        return pretplatnikID;
    }

    public void setPretplatnikID(int pretplatnikID) {
        this.pretplatnikID = pretplatnikID;
    }

    public Date getDatumCitanja() {
        return datumCitanja;
    }

    public void setDatumCitanja(Date datumCitanja) {
        this.datumCitanja = datumCitanja;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public double getNovoStanjeVT() {
        return novoStanjeVT;
    }

    public void setNovoStanjeVT(double novoStanjeVT) {
        this.novoStanjeVT = novoStanjeVT;
    }

    public double getNovoStanjeMT() {
        return novoStanjeMT;
    }

    public void setNovoStanjeMT(double novoStanjeMT) {
        this.novoStanjeMT = novoStanjeMT;
    }

    public double getFiksniDeoKW() {
        return fiksniDeoKW;
    }

    public void setFiksniDeoKW(double fiksniDeoKW) {
        this.fiksniDeoKW = fiksniDeoKW;
    }

    public int getCenaTarifeID() {
        return cenaTarifeID;
    }

    public void setCenaTarifeID(int cenaTarifeID) {
        this.cenaTarifeID = cenaTarifeID;
    }

    public Date getDatumTarife() {
        return datumTarife;
    }

    public void setDatumTarife(Date datumTarife) {
        this.datumTarife = datumTarife;
    }

    @Override
    public String toString() {
        return "Potrosnja{" +
                "pretplatnikID=" + pretplatnikID +
                ", datumCitanja=" + datumCitanja +
                ", datumOd=" + datumOd +
                ", datumDo=" + datumDo +
                ", novoStanjeVT=" + novoStanjeVT +
                ", novoStanjeMT=" + novoStanjeMT +
                ", fiksniDeoKW=" + fiksniDeoKW +
                ", cenaTarifeID=" + cenaTarifeID +
                ", datumTarife=" + datumTarife +
                '}';
    }
}
