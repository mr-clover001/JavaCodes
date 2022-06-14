public class stringBuilderDemo {
    public static void main(String[] args) {

        // stringBuilder is mutable we can make changes in str and it will not effect str thread
        //if you have a single threading application then go with string Builder
        // StringBuilder is more faster than StringBuffer because it is not synchronized
        StringBuilder s1 = new StringBuilder("Happy ");
        s1.append("learning ");
        System.out.println(s1);
//        System.out.println(s1.delete(0,1));
        System.out.println(s1.insert(0, "welcome "));
        System.out.println(s1.reverse());
    }
}
