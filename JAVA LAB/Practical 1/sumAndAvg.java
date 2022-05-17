import java.util.Scanner;

public class sumAndAvg {
    public static void main(String[] args){
        int n1, n2, sum;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 =sc.nextInt();

        System.out.println("Enter Second Number: ");
        n2 = sc.nextInt();

        sc.close();
        sum = n1+n2;
        avg = ((float)n1+(float)n2)/(float)2;

        System.out.println("Sum = "+sum+"\nAverage = "+avg);
    }
}