import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int i = 1;
        while (true){
            System.out.print(i);
            i = 1 + (i + m - 2) % n;
            if (i == 1) {
                break;
            }
        }
    }
}
