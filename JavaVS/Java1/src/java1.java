import java.util.*;
public class java1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name;
        name=sc.nextLine();
        System.out.println("Enter Your Birth Year");
        int by=sc.nextInt();
        int age=2021-by;
        System.out.println("Hey "+name+" you are "+age+" years old");
        
    }
}
    

