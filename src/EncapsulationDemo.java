import com.clover.Employee;

class Employee1{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class EncapsulationDemo {


    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        obj.setName("Anoop kumar");
        System.out.println(obj.getName());
    }
}
