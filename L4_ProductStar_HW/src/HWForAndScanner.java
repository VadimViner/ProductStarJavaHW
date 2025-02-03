import java.util.Scanner;

public class HWForAndScanner {
    public static void main(String[] args) {
        System.out.print("Введите число n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++){
            if (i == 0){
                System.out.print(i + " ");
            } else if(i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            } else if (i % 3 == 0){
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }

        }
    scanner.close();
    }}