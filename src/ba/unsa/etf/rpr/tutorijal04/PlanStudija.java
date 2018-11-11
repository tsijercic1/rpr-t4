package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class PlanStudija {
    private HashMap<Integer,HashMap<Predmet,Boolean>> semestri = new HashMap<>();

    public Boolean defineSemester(int semesterNumber, HashMap<Predmet, Boolean> predmeti){
        if(semestri.containsKey(semesterNumber)){
            return false;
        }
        semestri.put(semesterNumber,predmeti);
        return true;
    }

    public Set<Predmet> getPredmeteSemestra(int semesterNumber){
        Set<Predmet> predmeti = new TreeSet<>();
        HashMap<Predmet,Boolean> mapa = semestri.get(semesterNumber);
        for(HashMap.Entry<Predmet,Boolean> element : mapa.entrySet()){
            predmeti.add(element.getKey());
        }
        return predmeti;
    }



}
