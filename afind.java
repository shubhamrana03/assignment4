import java.util.Scanner;
public class afind {
 public static void main(String[] args)
{
 int i,a,count=0;
int b=0;
int[] marr = new int[10];
Scanner in = new Scanner(System.in);


for(i=0;i<10;i++)
{
  marr[i]=in.nextInt();
}

System.out.println("Enter number to fin");
a = in.nextInt();

for(i=0;i<10;i++)
{ if(marr[i]==a)
{
 count=1;
 
}
}
if(count==1)
{
 System.out.println("Number found " );
}
else
{
System.out.println("Not found");
}
}
}
  
