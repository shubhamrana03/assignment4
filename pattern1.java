import java.util.Scanner;
public class pattern1  {

    public static void main(String[] args) {
        int rows;
Scanner in = new Scanner(System.in);
rows = in.nextInt();

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}