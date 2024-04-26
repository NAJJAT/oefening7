import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Klant  implements Comparable<Klant>{

    private String name;
    

    private hashMap<boeken, Date> boodschappenmand = new hashMap<>() ;

    private static Set<Klant> klantlijst = new TreeSet<>();

    public Klant(String name) {
        this.name = name;
        klantlijst.add(this);
        //code code code
    }

    @Override
    public int compareTo(Klant o) {
        return this.name.compareTo(o.name);
    }

          public void voegToeAanMandje(boeken book) {
            this.boodschappenmand.put(book,new Date());
    
}
public void verwijderenUitMandje (boeken book)  throws BoekNietInMandjeExceptie{
     if (boodschappenmand.containsKey(book)) {
        boodschappenmand.remove(book);
     }else {
        throw new BoekNietInMandjeExceptie(book.getTitel());

     }


    }
    
}
