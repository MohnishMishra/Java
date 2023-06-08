import java.util.*;
public class OddAndEven {
    public static void main (String[] args) {
       Scanner myObj = new Scanner(System.in);
            int odd = 0;
            int even = 0;
            for(int i = 0; i < 10; i++) {
                System.out.print("Enter a number: ");
                int number = myObj.nextInt();
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Even: " + even + ", Odd: " + odd);
        }
    }


