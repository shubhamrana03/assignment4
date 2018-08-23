import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {

        int num, ori, c, result = 0;
Scanner in = new Scanner(System.in);
System.out.println("Enter number to check");
  num = in.nextInt();

        ori = num;

        while (ori != 0)
        {
            c = ori % 10;
            result += Math.pow(c, 3);
            ori /= 10;
        }

        if(result == num)
            System.out.println( "Armstrong");
        else
            System.out.println("Fail");
    }
}