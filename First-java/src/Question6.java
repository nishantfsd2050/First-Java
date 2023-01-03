import java.util.Scanner;


//Input currency in rupees and output in USD
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the INR");
        double inr = sc.nextDouble();

        double conDoller = inr/82.72;
        System.out.println(conDoller);

    }
}
