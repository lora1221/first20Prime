package first20Prime;
import java.util.Scanner;

public class first20Prime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers of prime you wanna print out: ");
        int number = keyboard.nextInt();
        int count = 0;
        for (int i = 0; i < 100 && count < 20; i ++) {
            boolean result = isPrime(i);
            if (result) {
                System.out.print(i + " ");
                count ++;
            }
        }

    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        double sqr = Math.sqrt(n);
        if ((n != 2 && n % 2 == 0) || (n != 5 && n % 5 == 0)){
            prime = false;
        } else {
            for (int i = 3; i <= sqr; i ++) {
                if (n % i == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
}
