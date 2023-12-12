public class  slang extends Dier implements Jager{
    public slang(String name) {
        super(name);
    }

     public void vervel() {
        System.out.println(getName()+"ik ververl");

   
    }

    @Override
    public void makgulid() {
        // TODO Auto-generated method stub
        System.out.println("ssssss");
    }

    @Override
    public void jaag() {
        // TODO Auto-generated method stub
       System.out.println(getName()+"vogeltje gevangen!");
    }

}
