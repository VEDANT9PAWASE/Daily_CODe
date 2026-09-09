


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int reverse = 0;

        int length = String.valueOf(a).length();

        for(int i = 0; i < length; i++) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            System.out.print(digit);
            a = a / 10;
        }
        System.out.println("\nReversed number: " + reverse);
        sc.close();
    }
}

