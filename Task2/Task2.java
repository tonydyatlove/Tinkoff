import java.util.Scanner;

public class Task2 {

    public static int algorithm(int n, int m, int k) {
        return (int) Math.ceil((double) (n * k) / m);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfJuniors = scanner.nextInt();
        int amountOfSeniors = scanner.nextInt();
        int amountOfRequiredSeniors = scanner.nextInt();
        System.out.println(algorithm(amountOfJuniors, amountOfSeniors, amountOfRequiredSeniors));
    }
}
