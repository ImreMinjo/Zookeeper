import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            for (int i = first; i <= second; i++){
                if ( 0 == i%15) {
                    System.out.println("FizzBuzz");
            }else if (0 == i%5) {
                    System.out.println("Buzz");
                }else if (0 == (i%3)){
                    System.out.println("Fizz");
                }else {
                    System.out.println(i);
                }
        }
    }
}