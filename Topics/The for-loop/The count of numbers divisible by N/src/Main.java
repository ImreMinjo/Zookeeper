import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int num = 0;

        for (int i = a; i <= b; i++){
            if (0 == i%n){
                num++;
                 }
        }System.out.print(num);
    }
}