class Employee{
   private int num = 5;
    private String name;

    public void display1(int num, String name){
        System.out.println(num + " " + name);
    }
}
public class EncapsulationDemo2 {
   private String name;
   private int ID;
   private int salary;

   public void display(int ID ,int salary , String name){
       System.out.println(name + " " + ID + " " + salary);
   }
    public static void main(String[] args) {

       Employee em = new Employee();
       EncapsulationDemo2 en = new EncapsulationDemo2();
       en.display(123, 20000, "Anoop sharma");
      em.display1(45, "Sumit Sharma");
    }
}
