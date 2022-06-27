class Employee{
   private int num ;
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

       EncapsulationDemo2 en = new EncapsulationDemo2();
       en.display(123, 20000, "Anoop sharma");

    }
}
