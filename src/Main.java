import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = sc.nextDouble();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter rate: ");
        rate = sc.nextDouble();
        double totalInterest = 1.0;
        for (int i = 0; i < month ; i++) {
            totalInterest += money * (rate/100)/12 *month;
        }
            System.out.println("Total money: " +totalInterest);

    }
}