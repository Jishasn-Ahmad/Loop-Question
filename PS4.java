import java.util.Scanner;
package LoopQuestions;

public class PS4 {
    
// Write a program to find the factorial value of any number entered through the keyboard.
public static void main(String[] args) {
    Scaner sc = new Scanner(System.in);
int num;
int fact = 1;

System.out.println("Enter any positive integer:");
num = sc.nextInt();
for(int i=1; i<num; i++){
    fact*=i;
}
System.out.println("Factorial:" + fact);
}

}
