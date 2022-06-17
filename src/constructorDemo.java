public class constructorDemo {


        int id;
        String name;
        int age;
        //creating two arg constructor
        constructorDemo(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        constructorDemo(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        void display(){System.out.println(id+" "+name+" "+age);}

        public static void main(String args[]){
            constructorDemo s1 = new constructorDemo(111,"Karan");
            constructorDemo s2 = new constructorDemo(222,"Aryan",25);
            s1.display();
            s2.display();
        }

}
