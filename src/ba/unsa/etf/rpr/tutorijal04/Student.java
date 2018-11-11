package ba.unsa.etf.rpr.tutorijal04;


import java.util.Set;

public class Student {
    private String imePrezime;
    private int brIndexa;
    private int zavrsioSemestar=0;

    public Student(String imePrezime, int brIndexa) {
        this.imePrezime = imePrezime;
        this.brIndexa = brIndexa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public Set<Predmet> dajUpisanePredmete(){
        Set<Predmet> predmeti = Upis.getPredmeteStudenta(this);
        return predmeti;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getZavrsioSemestar() {
        return zavrsioSemestar;
    }

    //public void setZavrsioSemestar(int zavrsioSemestar) {
      //  this.zavrsioSemestar = zavrsioSemestar;
    //}

    int compareTo(Student student){
        return this.getImePrezime().compareTo(student.getImePrezime());
    }
}
