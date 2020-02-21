import java.util.Date;

public class Administrator extends Uzivatel {

    private String telCislo;
    private String nazevUctu;

    public Administrator (Date vytvoreno, String jmeno, String prijimeni, Integer vek, String telCislo, String nazevUctu){
        super(vytvoreno, jmeno, prijimeni, vek);

        this.telCislo = telCislo;
        this.nazevUctu = nazevUctu;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    public String getNazevUctu() {
        return nazevUctu;
    }

    public void setNazevUctu(String nazevUctu) {
        this.nazevUctu = nazevUctu;
    }
}
