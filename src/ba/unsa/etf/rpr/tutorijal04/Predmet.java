package ba.unsa.etf.rpr.tutorijal04;


import java.util.Set;


public class Predmet {
    private String imePredmeta;

    private int ects;
    private Set<Student> studenti;

    public Predmet(String imePredmeta, int ects) {
        this.imePredmeta = imePredmeta;
        this.ects = ects;
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

}
