public  class Eiend extends Dier implements Vogel {
    public Eiend(String name) {
        super(name);
    }

    @Override
   public void makgulid() {
        // TODO Auto-generated method stub
        System.out.println(getName()+"bak bak");
    

   }

    @Override
    public void vlieg() {
        // TODO Auto-generated method stub
       System.out.println(getName()+"vlutrer");
    }
    
    
}
