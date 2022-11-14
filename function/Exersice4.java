import java.util.Scanner;

public class Exersice4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        number = scanner.nextInt();
        System.out.println(primeNumber(number));
    }

    public static boolean primeNumber(int number) {
        boolean even=true;
        for (int i = 2 ;i < number; i++) {
            if (number % i == 0){
                even=false;
                break;
            }
        }
        return even;

    }
}

