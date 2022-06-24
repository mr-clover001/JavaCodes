abstract class Bank{
    abstract int getRateOfInterest();
    static  void fuckClass(){
        System.out.println("come On");
    }
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}

class AbstractClassExample{
    public static void main(String args[]){
        Bank c = new SBI();
        c.fuckClass();
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }}