import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tillN = input.nextInt();
        for (int i = 0; i<=tillN; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n)
    {
        if (n<=1)
        {
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}