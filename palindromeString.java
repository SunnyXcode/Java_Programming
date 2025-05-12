package Array;
import java.util.Scanner;

public class palindromeString {

    public boolean palindrome(String str) {

        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (ch[start] != ch[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        palindromeString ob = new palindromeString();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (ob.palindrome(str) == true) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

}
