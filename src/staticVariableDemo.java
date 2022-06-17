public class staticVariableDemo {

        int rollno;//instance variable
        String name;
        static String college ="ITS";//static variable
        //constructor
        staticVariableDemo(int r, String n){
            rollno = r;
            name = n;
        }
        //method to display the values
        void display (){System.out.println(rollno+" "+name+" "+college);}

    //Test class to show the values of objects


        public static void main(String args[]){
            staticVariableDemo s1 = new staticVariableDemo(111,"Karan");
            staticVariableDemo s2 = new staticVariableDemo(222,"Aryan");
            //we can change the college of all objects by the single line of code
            //Student.college="BBDIT";
            s1.display();
            s2.display();
        }

}