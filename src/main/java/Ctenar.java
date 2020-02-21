import java.util.Date;

public class Ctenar extends Uzivatel{

    private Integer prectenoKnih;
    private Date ucetZalozen;

    public Ctenar(Date vytvoreno, String jmeno, String prijimeni, Integer vek, Integer prectenoKnih, Date ucetZalozen){
        super(vytvoreno, jmeno, prijimeni, vek);

        this.prectenoKnih = prectenoKnih;
        this.ucetZalozen = ucetZalozen;
    }

    public Integer getPrectenoKnih() {
        return prectenoKnih;
    }

    public void setPrectenoKnih(Integer prectenoKnih) {
        this.prectenoKnih = prectenoKnih;
    }

    public Date getUcetZalozen() {
        return ucetZalozen;
    }

    public void setUcetZalozen(Date ucetZalozen) {
        this.ucetZalozen = ucetZalozen;
    }

    @Override
    String login() {
        String ctenar = System.out.println(String.format("Uživatel typu %s se jménem %s %s ve věku %s je zrovna přihlášen", getClass(), getJmeno(),getPrijimeni(), getVek());
        return ctenar;
    }
}
