package mcdan.demo;
import java.util.Scanner;

public class Task_1_Question_1 {
    public static void main(String[] args) {
        Scanner nvalues = new Scanner(System.in);
        int n = nvalues.nextInt();
        System.out.println("Enter the number of value of n: " +n);
        for(int i = 10; i <= n; i++){
            System.out.println(i);
        }
    }
}