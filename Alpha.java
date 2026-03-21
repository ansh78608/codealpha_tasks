import java.util.*;
public class Alpha
{
    public static void main ( String[] args)
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter your marks");
        int m=sc.nextInt();
        if(m<=100&&m>=90)
        { 
            System.out.println("your grades A");
        }
          else if (m<=90&&m>=80)
        {
            System.out.println("your grades B");
        }
             else if (m<=80&&m>=65)
        {
            System.out.println("your grades C");
        }
             else if (m<=65&&m>=40)
        {
            System.out.println("your grades D");
        }
        else {
            System.out.println("your are Fail");
        }
        
    }
}