
import java.util.Scanner;

public class Table {
    // write a program that prompts the user to input a +ve integer. it should then
    // print the multiplication table of that number

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num;

        System.out.println("Enter any positive integer:");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        for(int i=1; i<=10; i++){
            System.out.println(num +"x" + i + "=" + (num*i));
        }
        
    }
}
