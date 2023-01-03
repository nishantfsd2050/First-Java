import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int n = sc.nextInt();
        System.out.println("please enter the second number");
        int m = sc.nextInt();
        System.out.println("which operation do you want to perform?\n1-Addition\n2-Substraction\n3-Multiply\n4-Divide");
        int operation = sc.nextInt();

        if (operation==1){
            System.out.println(n+m);
        } else if(operation==2){
            System.out.println(n-m);
        } else if(operation==3){
            System.out.println(n*m);
        } else if (operation==4){
            float div =(float) n/m;
            System.out.println(div);
        } else {
            System.out.println("Invalid option");
        }

    }


}
