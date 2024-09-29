package Questions;
    import java.util.Scanner;

public class replacethemall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String str = Long.toString(n);
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                result += '5';
            } else {
                result += str.charAt(i);
            }
        }
        
        System.out.println(result);
    }
}
    

