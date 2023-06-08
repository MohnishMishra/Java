import java.util.*;
import java.io.*;

public class q3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        // System.out.println("part a");
        String str1 = sc.next();

        // 1
        StringBuffer strNew = new StringBuffer();
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if('a' <= ch && ch <= 'z'){
                strNew.append((char)(ch - 'a' + 'A'));
            }
            else if('A' <= ch && ch <= 'Z'){
                strNew.append((char)(ch - 'A' + 'a'));
            }
            else {
                strNew.append(ch);
            }
        }
        System.out.println(strNew);

        // 2
        StringBuffer str2 = new StringBuffer (str1);
        System.out.println(str2.reverse());

        // 3
        String str3 = sc.next();
        String str4 = sc.next();
        if(str3.compareTo(str4) > 0) {
            System.out.println("str 1 is greater");
        }
        else if(str3.compareTo(str4) == 0) {
            System.out.println("strings equal");
        }
        else {
            System.out.println("str 2 is greater");
        }

        // 4
        String garbage = sc.nextLine();
        String str5 = sc.nextLine();
        String str6 = sc.nextLine();
        // System.out.println(str5);
        // System.out.println(str6);
        StringBuffer strBuf = new StringBuffer(str5);
        strBuf.insert(1, str6);
        System.out.println(strBuf);
    }
}