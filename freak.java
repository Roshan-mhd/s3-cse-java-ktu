import java.util.Scanner;
public class freak {
    public static void main(String args[])
    {
        System.out.println("Enter the string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Enter the letter");
        String key = s.nextLine();
        int len = str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==key.charAt(0))
            {
                count++;
            }
        }
        System.out.println("Frequency of the character is "+count);
    }
}
   