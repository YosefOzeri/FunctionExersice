import java.util.Scanner;

public class Exersice1 {

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

   graterNumber(firstNumber,secondNumber,thirdNumber);

  }

  public static void graterNumber(int firstNumber, int secondNumber, int thirdNumber) {

    if (firstNumber > secondNumber) {
      if (firstNumber > thirdNumber) {
        System.out.println("The grater number is: " + firstNumber);
      } else {
        System.out.println("The grater number is: " + thirdNumber);

      }

    }
    if (secondNumber > thirdNumber) {
      System.out.println("The grater number is: " + secondNumber);
    } else {
      System.out.println("The grater number is: " + thirdNumber);

    }
  }

  }






