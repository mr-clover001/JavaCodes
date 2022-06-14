public class stringBufferDemo {
    public static void main(String[] args) {

        // stringBuffer is mutable we can make changes in str and it will not effect str thread
        // for multiple access then go with StringBuffer
        StringBuffer str = new StringBuffer("Sharma");
        System.out.println(str.append(" Anoop"));
        System.out.println(str.insert(0, "welcome "));
        System.out.println(str.reverse());
    }
}
