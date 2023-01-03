import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = sc.nextInt();
        int n1=0, n2= 1,n3;
        System.out.print(n1 +","+ n2);

        for(int i=1; i<=n-2; i++){
            n3= n1+n2;
            System.out.print("," + n3);
            n1=n2;
            n2=n3;
        }
        
    }
}
