import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (A < B && A > H){
            System.out.print("Deficiency");
        }else if (A < B && A <= H && B >= H){
            System.out.print("Normal");
        }else if (A < B && A <= H && B < H){
            System.out.print("Excess");
    }
}
}