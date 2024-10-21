package mcdan.demo;
import java.util.Scanner;
public class Task_1_Question_3 {
    public static void main(String[] args) {
        Scanner objvalue = new Scanner(System.in);
        int n = objvalue.nextInt();
        int i = 0;
        while(n!=0){
            int a = n%10;
            i = i*10+a;
            n=n/10;
            }
        System.out.println(i);
        }
    }