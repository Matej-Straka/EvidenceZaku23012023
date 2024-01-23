import java.math.BigDecimal;
import java.time.LocalDate;

public class Nakup {
    private BigDecimal cena;
    private LocalDate datum;

    public Nakup(BigDecimal cena, LocalDate datum) {
        this.cena = cena;
        this.datum = datum;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
