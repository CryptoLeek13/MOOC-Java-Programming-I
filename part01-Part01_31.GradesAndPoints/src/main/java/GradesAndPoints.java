
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int gradePoint = Integer.valueOf(s.nextLine());
        if (gradePoint < 0){
            System.out.println("Grade: impossible!");
        } else if (gradePoint <= 49){
            System.out.println("Grade: failed");
        } else if (gradePoint <= 59){
            System.out.println("Grade: 1");
        } else if (gradePoint <= 69) {
            System.out.println("Grade: 2");
        } else if (gradePoint <= 79) {
            System.out.println("Grade: 3");
        } else if (gradePoint <= 89) {
            System.out.println("Grade: 4");
        } else if (gradePoint <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
