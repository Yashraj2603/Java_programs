import java.util.Scanner;
public class Cgp {
     public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         int total=0;
         float percentage;
         double cgp;
         System.out.println("Enter marks of three subjects,Max marks=100");
         int []marks=new int[3];
         for(int i=0;i<3;i++)
         { 
             marks[i]=s.nextInt();
            
             total+=marks[i];
         }
         percentage=total/3;
         System.out.println("Percentage secured="+percentage);
         cgp=(percentage/10)+0.5;
        System.out.println("CGP secured by student="+cgp);
        
    }
}
