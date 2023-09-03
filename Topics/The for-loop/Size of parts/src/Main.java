import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int perfect = 0;
        int small = 0;
        int large = 0;

           for (int i = 0; i < n; i++){
               int num = scanner.nextInt();
               if (num == -1){
                   small++;
               }
            else if (num == 0){
                perfect++;
            }
               else if (num == 1){
                   large++;
            }
           }
        System.out.print(perfect + " " + large + " " + small);
        }
    }
