import java.util.*;

public class fibonacci {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series of " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
        
        sc.close();
    }
}