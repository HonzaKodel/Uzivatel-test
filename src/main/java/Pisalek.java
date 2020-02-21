import java.util.Date;

public class Pisalek extends Uzivatel {

    private Integer napsanoKnih;
    private Date posledniPrihlaseni;

    public Pisalek(Date vytvoreno, String jmeno, String prijimeni, Integer vek, Integer napsanoKnih, Date posledniPrihlaseni){
        super(vytvoreno, jmeno, prijimeni, vek);

        this.napsanoKnih = napsanoKnih;
        this.posledniPrihlaseni = posledniPrihlaseni;
    }

    public Integer getNapsanoKnih() {
        return napsanoKnih;
    }

    public void setNapsanoKnih(Integer napsanoKnih) {
        this.napsanoKnih = napsanoKnih;
    }

    public Date getPosledniPrihlaseni() {
        return posledniPrihlaseni;
    }

    public void setPosledniPrihlaseni(Date posledniPrihlaseni) {
        this.posledniPrihlaseni = posledniPrihlaseni;
    }
}
