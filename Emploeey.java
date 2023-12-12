public class Emploeey  {

    private String name;
    private int salary;
    private int age;
    private String job;
    private Department depart;
   
public Emploeey ()  {}
 
 /*
  * wrm  moet ik een lieg conctract in Emploeey Class maken  om te kun de concept Composition uitvoeren???
  * zonder lieg  conctract  in Emploeey  Class ik kan niet  Concept
  * Composition uitvoeren??
  */
  
    public Emploeey(String name, int salary, int age, String job,String departmentName, int departmenID) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.job = job;
        this.depart = new Department(departmenID, departmentName);



    }
        @Override
        public String toString() {
            return "Empleey [ "+"name="+ this.name +" "+"salay="+this.salary+" "+"age="+this.age+" "+"job="+this.job+ " "+"Department=" + depart.getDepartmentName() + " "+", DepartmenID=" +depart.getDepartmentName()+ "]";
        }
        
       
    
}
