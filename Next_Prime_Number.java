import java.util.Scanner;
public class Next_Prime_Number {
    int prime = 1;
    public static int nextPrime(int num) {
        num++;
        for (int i = 2;i<num;i++) {
            if ((num % i) == 0) {
                num++;
                i = 2;
            }
            else {
                continue;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("The Next Prime Number is "+nextPrime(num));
    }
}
