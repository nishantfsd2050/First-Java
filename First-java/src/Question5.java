import java.util.Scanner;

//Take 2 numbers as input and print the largest number
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First number");
        int n = sc.nextInt();
        System.out.println("Please enter Second number");
        int m = sc.nextInt();

        if (n>m){
            System.out.println("Largest number is: "+ n);
        } else if (m>n) {
            System.out.println("Largest number is: " + m);
        } else {
            System.out.println("Both are equal");
        }
    }
}
