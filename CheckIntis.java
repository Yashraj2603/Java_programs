import java.util.Scanner;
public class CheckIntis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt())
        System.out.println(s.nextInt()+"is valid integer");
        else
        System.out.println(s.nextInt()+"is not valid integer");

        
    }
    
}
