import java.util.Scanner;

public class ReplaceLetters
{
    public static void main(String[] args)
    {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f') .replace('l','t');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
