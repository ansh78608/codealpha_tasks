import java.util.*;
public class Alpha2 {
     public static void main ( String[] args)
      {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter number of student");
        int num=sc.nextInt();
        
        int sum=0;
        int highest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        for(int i=0;i<num;i++)
        {
             System.out.println("Enter each student marks"); 
             int marks=sc.nextInt(); 
             sum =sum + marks;
             if (marks>highest)
             {
                highest=marks;
             }
            if (marks<lowest)
             {
                lowest=marks;
             }

        }
       double aver=(double) sum/num;
        System.out.println("Average Marks: " + aver);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

      }
    } 