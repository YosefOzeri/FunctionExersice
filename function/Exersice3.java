import java.util.Scanner;

public class Exersice3 {
    public static void main(String[] args) {

        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your number");
        number=scanner.nextInt();
        System.out.println( checkEven(number));
    }
    public static boolean checkEven(int number){
        if (number%2==0){
            return true;
        }
        else {
            return false;
        }

    }
}
