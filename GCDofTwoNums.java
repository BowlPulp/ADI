
import java.util.*;

public class GCDofTwoNums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int gcd = 0;

//running loop form 1 to the smallest of both numbers  
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }

        System.out.print(gcd);
    }
}
