import java.util.Scanner;

public class OddNumberDoWhileEx {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("Enter an odd  number: ");
            number = sc.nextInt();

            if (number % 2 != 0) {
                System.out.println(number + " is odd");
                for(int i = 1; i <= number; i++){
                    if (i % 2 == 0 && i % 4 == 0){
                    sum += i;
                    }
                }
            }
            else {
                System.out.println(number + " is even, enter an ODD number!");
            }
        } while(number % 2 == 0);
        System.out.println(sum);
    }
}
