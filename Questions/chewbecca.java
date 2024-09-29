package Questions;
import java.util.*;
    public class chewbecca {
 
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String x = sc.next(); 

        StringBuilder result = new StringBuilder();  
        char[] digits = x.toCharArray(); 
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';  

           
            if (digit > 4) {
                if (i == 0 && digit == 9) { 
                    result.append(digit);
                } else {
                    result.append(9 - digit);
                }
            } else {
                result.append(digit);
            }
        }
        System.out.println(result.toString());
    }
}
    
    

