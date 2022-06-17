public class CloneValueConstructor {
    int id;
    String name;
    //constructor to initialize integer and string
    CloneValueConstructor(int i,String n){
        id = i;
        name = n;
    }
    //constructor to initialize another object
    CloneValueConstructor(CloneValueConstructor s){
        id = s.id;
        name =s.name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        CloneValueConstructor s1 = new CloneValueConstructor(111,"Karan");
        CloneValueConstructor s2 = new CloneValueConstructor(s1);
        s1.display();
        s2.display();
    }
}
