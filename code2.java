import java.util.*;
class mayank {
    public static void main(String[] args) {

        int firstTerm = 0, secondTerm = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate fibonacci series upto nth number");
        n=sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " number:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}