import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        boolean sum = (B + C > A) && (A + B > C) && (A + C > B);
        if (sum){
        System.out.print("YES");
    }
    else {
        System.out.print("NO");
   }
    }
}