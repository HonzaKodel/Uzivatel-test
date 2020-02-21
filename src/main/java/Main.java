import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args){

        SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd-MM-yyyy");

        String formatDatum = "18-02-2020";
        Calendar calendar = new GregorianCalendar(2020, 2, 21);
        Date date = null;
        {
            try {
                date = DATE_FORMATER.parse(formatDatum);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        List<Uzivatel> uzivatels = new ArrayList<>();

            Uzivatel A1 = new Administrator("18-2-2020", "Helmut", "Heinz", 69, "580 259 581", "AdminHeinz");
            Uzivatel A2 = new Administrator();
            Uzivatel A3 = new Administrator();

        Uzivatel C1 = new Ctenar();
            Uzivatel C2 = new Ctenar();
        Uzivatel C3 = new Ctenar();

            Uzivatel P1 = new Pisalek();
        Uzivatel P2 = new Pisalek();
        Uzivatel P3 = new Pisalek();
    }
}
