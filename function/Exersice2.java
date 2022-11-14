import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your first number");
        firstNumber=scanner.nextInt();
        System.out.println("Please enter your second number");
        secondNumber=scanner.nextInt();
        System.out.println("Please enter your third number");
        thirdNumber=scanner.nextInt();

        System.out.println( average(firstNumber,secondNumber,thirdNumber));


    }
    public static double average(int firstNumber,int secondNumber,int thirdNumber) {
        return ((firstNumber+secondNumber+thirdNumber)/3);

    }
}
