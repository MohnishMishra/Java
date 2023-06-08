package Lab5;

import java.math.*;
public class RandomNumber {
    public static void main(String[] args) {
        int randNum = (int) (10*Math.random()%6 + 1);
        System.out.println(randNum);
    }
}
