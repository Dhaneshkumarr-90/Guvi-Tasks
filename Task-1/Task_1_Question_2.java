package mcdan.demo;
import java.util.Scanner;
public class Task_1_Question_2 {
    public static void main(String[] args) {
        Scanner objvalue = new Scanner(System.in);
        int n = objvalue.nextInt();
        if(n>0){
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negative");
        }else{
            System.out.println("Zero");
        }
    }
}