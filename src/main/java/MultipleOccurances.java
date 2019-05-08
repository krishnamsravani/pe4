import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances
{
    public static void main(String[] args)
    {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String text    =sc.nextLine();
        System.out.println("enter the word:");
        Scanner s=new Scanner(System.in);
        String patternString = s.nextLine() ;

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }
}
