package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Upis {
    private static Set<Student> studenti = new TreeSet<>();
    private static Set<Predmet> predmeti= new TreeSet<>();
    private static ArrayList<PlanStudija> planoviStudija = new ArrayList<>();

    public static void upisiStudentaNaSemestar(Student student, int brojSemestra, PlanStudija planStudija){

    }

    public static Set<Student> getStudenteNaPredmetu(Predmet predmet){

        return predmet.getStudenti();
    }

    public static Set<Predmet> getPredmeteStudenta(Student student){
        return null;
    }

}
