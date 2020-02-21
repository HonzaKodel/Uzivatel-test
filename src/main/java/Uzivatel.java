import java.util.Date;

public class Uzivatel {
    private Date vytvoreno;
    private String jmeno;
    private String prijimeni;
    private Integer vek;

    public Uzivatel(Date vytvoreno, String jmeno, String prijimeni, Integer vek){
        this.vytvoreno = vytvoreno;
        this.jmeno = jmeno;
        this.prijimeni = prijimeni;
        this.vek = vek;
    }

    public Date getVytvoreno() {
        return vytvoreno;
    }

    public void setVytvoreno(Date vytvoreno) {
        this.vytvoreno = vytvoreno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijimeni() {
        return prijimeni;
    }

    public void setPrijimeni(String prijimeni) {
        this.prijimeni = prijimeni;
    }

    public Integer getVek() {
        return vek;
    }

    public void setVek(Integer vek) {
        this.vek = vek;
    }
}
