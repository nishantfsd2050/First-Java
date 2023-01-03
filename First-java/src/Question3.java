import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Principle Amount:");
        float pAmount = sc.nextFloat();
        System.out.println("Please enter the time");
        float time = sc.nextFloat();
        System.out.println("Please enter the rate of interest:");
        float rate = sc.nextFloat();

        float interest =  (pAmount*time*rate)/100;
        System.out.println("\n" + interest);
    }
}
