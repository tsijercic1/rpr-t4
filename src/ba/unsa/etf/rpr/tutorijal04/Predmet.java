package ba.unsa.etf.rpr.tutorijal04;


import java.util.Set;
import java.util.TreeSet;


public class Predmet {
    private String imePredmeta;

    private int ects;
    private Set<Student> studenti;

    public Predmet(String imePredmeta, int ects) {
        this.imePredmeta = imePredmeta;
        this.ects = ects;
        studenti= new TreeSet<>();
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public void upisiStudenta(Student student){
            studenti.add(student);
    }

    public void ispisiStudenta(Student student){
        studenti.remove(student);
    }

    public Set<Student> getStudenti() {
        return studenti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predmet)) return false;

        Predmet predmet = (Predmet) o;

        if (getEcts() != predmet.getEcts()) return false;
        if (getImePredmeta() != null ? !getImePredmeta().equals(predmet.getImePredmeta()) : predmet.getImePredmeta() != null)
            return false;
        return getStudenti() != null ? getStudenti().equals(predmet.getStudenti()) : predmet.getStudenti() == null;
    }

    @Override
    public int hashCode() {
        return getImePredmeta() != null ? getImePredmeta().hashCode() : 0;
    }

    int compareTo(Predmet predmet){
        return this.getImePredmeta().compareTo(predmet.getImePredmeta());
    }
}
