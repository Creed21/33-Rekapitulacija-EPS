package model;

public class Pretplatnik {
    private int id;
    private String imePrezime;
    private String adresa;
    private String postanskiReon;
    private int mestoId;
    private int tarifniSastavId;

    public Pretplatnik() {
    }

    public Pretplatnik(int id, String imePrezime, String adresa, String postanskiReon, int mestoId, int tarifniSastavId) {
        this.id = id;
        this.imePrezime = imePrezime;
        this.adresa = adresa;
        this.postanskiReon = postanskiReon;
        this.mestoId = mestoId;
        this.tarifniSastavId = tarifniSastavId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getPostanskiReon() {
        return postanskiReon;
    }

    public void setPostanskiReon(String postanskiReon) {
        this.postanskiReon = postanskiReon;
    }

    public int getMestoId() {
        return mestoId;
    }

    public void setMestoId(int mestoId) {
        this.mestoId = mestoId;
    }

    public int getTarifniSastavId() {
        return tarifniSastavId;
    }

    public void setTarifniSastavId(int tarifniSastavId) {
        this.tarifniSastavId = tarifniSastavId;
    }

    @Override
    public String toString() {
        return "Pretplatnik{" +
                "id=" + id +
                ", imePrezime='" + imePrezime + '\'' +
                ", adresa='" + adresa + '\'' +
                ", postanskiReon='" + postanskiReon + '\'' +
                ", mestoId=" + mestoId +
                ", tarifniSastavId=" + tarifniSastavId +
                '}';
    }
}
