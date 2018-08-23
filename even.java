import java.util.Scanner;
public class even
{
 public static void main(String[] args) {
 int n,i;
Scanner in = new Scanner(System.in);
int[] marr = new int[10];
System.out.println("Enter elements");
for(i=0;i<10;i++)
{
  marr[i]=in.nextInt();
} 

System.out.println("Even elements are");
 
for(i=0;i<10;i++)
{
 if(marr[i] % 2 ==0)
{ 
  if(marr[i] != 0)
{
 System.out.println(marr[i]);
}
}
}
}
}