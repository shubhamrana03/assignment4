import java.util.Scanner;
public class sort
{
 public static void main(String[] args) {
 int j,i,a;
Scanner in = new Scanner(System.in);
int[] marr = new int[10];
System.out.println("Enter elements");
for(i=0;i<10;i++)
{
  marr[i]=in.nextInt();
} 
 
System.out.println("After Sorting");
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
 if(marr[i]>marr[j])
{
 a = marr[i];
 marr[i] = marr[j];
 marr[j] = a;
}
}
System.out.println(marr[i]);
}
}
}
