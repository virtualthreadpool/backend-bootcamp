 public class ReverseString {
    public static void main(String[] args) {
        String str = "sukanya";
        String reverse = "";
        for (int i = str. length() - 1; i>=0; i--){
            reverse = reverse + str.charAt(i);

        }
        System.out.println("original String:" + str);
        System.out.println("reverse String:" + reverse);
    }



}
