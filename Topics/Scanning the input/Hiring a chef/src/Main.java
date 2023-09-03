import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String years = scanner.next();
        String cuisinepreference = scanner.next();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef who cooks " + cuisinepreference + " dishes and has " + years + " years of experience.");
    }
}