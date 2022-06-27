
public class EncapsulationDemo2 {
   private String name;
   private int ID;
   private int salary;

   public void display(int ID ,int salary , String name){
       System.out.println(name + " " + ID + " " + salary);
   }
    public static void main(String[] args) {

       EncapsulationDemo2 en = new EncapsulationDemo2();
    }
}
