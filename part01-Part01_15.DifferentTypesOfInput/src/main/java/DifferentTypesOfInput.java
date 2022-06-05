
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        
        String title = s.nextLine();
        
        System.out.println("Give an integer: ");
        
        Integer num = Integer.valueOf(s.nextLine());
        
        System.out.println("Give a double: ");
        
        Double dec = Double.valueOf(s.nextLine());
        
        System.out.println("Give a boolean: ");
        
        Boolean value = Boolean.valueOf(s.nextLine());
        
        System.out.println("You gave the string " + title);
        
        System.out.println("You gave the integer " + num);
        
        System.out.println("You gave the double " + dec);
        
        System.out.println("You gave the boolean " + value);

    }
}
