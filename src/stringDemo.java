public class stringDemo {
    public static void main(String[] args) {
        String str = "Sharma";
        String str2 = "Sharm2";
        String replace = str2.replace('2','a');

        System.out.println(replace.contains("2"));
        System.out.println(replace);
        System.out.println("printing the equality of string "+str.equals(replace));
        System.out.println(str.length());
        System.out.println(str.substring(2));
        System.out.println(str.compareTo(str2));
    }
}
