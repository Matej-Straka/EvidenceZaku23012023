import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zak {
    private String jmeno;
    private String prijmeni;
    public boolean gdpr;
    private LocalDate datumNarozeni;
    private int rocnik;
    private List<Nakup> seznamNakupu = new ArrayList<>();

    public Zak(String jmeno, String prijmeni, LocalDate datumNarozeni, boolean gdpr, int rocnik, List<Nakup> seznamNakupu) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.gdpr = gdpr;
        this.rocnik = rocnik;
        this.seznamNakupu = seznamNakupu;
    }

    public boolean isGdpr() {
        return gdpr;
    }

    public void setGdpr(boolean gdpr) {
        this.gdpr = gdpr;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public List<Nakup> getSeznamNakupu() {
        return seznamNakupu;
    }

    public void setSeznamNakupu(List<Nakup> seznamNakupu) {
        this.seznamNakupu = seznamNakupu;
    }
}
