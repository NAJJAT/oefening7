public class Kat extends Dier implements Jager{
    public Kat(String name) {
        super(name);
    }

    @Override
   public void makgulid() {
        // TODO Auto-generated method stub
        System.out.println(getName()+"moeuw");
    }

    public  void vangMuis(){

        System.out.println(getName()+"muis gevangen!");

    }

    @Override
    public void jaag() {

      System.out.println(getName()+"muis gevangen!");

        
    
    }

    
}
