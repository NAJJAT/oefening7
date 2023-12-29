import java.util.ArrayList;
import java.util.List;

public class mian {
    public static void main(String[] args) {
        
      List<boeken> boekenwinkel = new ArrayList<boeken>();

      boekenwinkel.add(new fictie("ammar"));
      boekenwinkel.add(new fictie("ammar"));
      boekenwinkel.add(new fictie("ieman"));
      boekenwinkel.add(new fictie("kookene"));
      System.out.println("De total  boeken  van  de boekenWinkel is:"+boekenwinkel.size());
      System.out.println(boekenwinkel.toString());
      
      



        

    }
    
}
