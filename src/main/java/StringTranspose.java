import java.util.Scanner;

public class StringTranspose
{
    public void reverseWordInMyString(String str)
    {
        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println("entered string:"+str);
        System.out.println("reverse string:"+reversedString);
    }
    public static void main(String[] args)
    {
        StringTranspose obj = new StringTranspose();
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        obj.reverseWordInMyString(str);
    }
}
