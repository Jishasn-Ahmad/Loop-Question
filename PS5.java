import java.util.*;
public class PS5 {
    public static void main(String[] args) {
        // sum of n natural numbers

        Scanner sc = new Scanner(System.in);1
        int n = sc.nextInt();
        int sum =0;

        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
