import java.security.PublicKey;

interface Money{
    void Operation();
}

 class Debit implements Money{
    public void Operation(){
        System.out.println("Debiting the money");
    }
 }

 class Credit implements Money{
     public void Operation(){
         System.out.println("Credit the money");
     }
 }
public class InterfaceDemo {

    public static void main(String[] args) {
     Money d = new Debit();
     d.Operation();
    }
}
