import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        int sum = (nuts/squirrels);
        System.out.println(sum);
    }
}