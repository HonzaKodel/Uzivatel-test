import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

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

        Uzivatel A1 = new Administrator(DATE_FORMATER.parse("01-06-2077"), "Helmut", "Heinz", 69, "580 259 581", "AdminHeinz");
        uzivatels.add(A1);
        Uzivatel A2 = new Administrator(DATE_FORMATER.parse("29-02-2020"), "Marie", "Florencová", 23, "963 852 741", "MarieRules");
        uzivatels.add(A2);
        Uzivatel A3 = new Administrator(DATE_FORMATER.parse("01-01-2019"), "Arnošt", "Albrecht", 31, "789 456 123", "AA1");
        uzivatels.add(A3);

        Uzivatel C1 = new Ctenar(DATE_FORMATER.parse("08-09-2018"), "Adolf", "Rusnák", 45, 12, DATE_FORMATER.parse("04-07-2017"));
        uzivatels.add(C1);
        Uzivatel C2 = new Ctenar(DATE_FORMATER.parse("03-11-2016"), "Ondřej", "Postrčil", 85, 55, DATE_FORMATER.parse("01-03-1997"));
        uzivatels.add(C2);
        Uzivatel C3 = new Ctenar(DATE_FORMATER.parse("07-01-2003"), "František", "Popletal", 47, 26, DATE_FORMATER.parse("03-09-2001"));
        uzivatels.add(C3);

        Uzivatel P1 = new Pisalek(DATE_FORMATER.parse("05-04-2011"), "Herb", "Plot", 56, 45, DATE_FORMATER.parse("02-03-2014"));
        uzivatels.add(P1);
        Uzivatel P2 = new Pisalek(DATE_FORMATER.parse("09-02-2004"), "Albrecht", "Potěšil", 56, 78, DATE_FORMATER.parse("02-07-2015"));
        uzivatels.add(P2);
        Uzivatel P3 = new Pisalek(DATE_FORMATER.parse("07-05-2017"), "Jana", "Umyvadlová", 15, 24, DATE_FORMATER.parse("01-06-2018"));
        uzivatels.add(P3);

        for (Uzivatel uzivatel : uzivatels){
            System.out.println(uzivatel.login());
        }
    }
}
