import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");

        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int z = myObj.nextInt();

        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

    }
}