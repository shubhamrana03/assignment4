import java.util.Scanner;
class prime
{
   public static void main (String[] args)
   {		
      Scanner in = new Scanner(System.in);
      int i =0;
      int num =0;
     
      String  prime = "";
      System.out.println("Enter the value of n:");
      int n = in.nextInt();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int count=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		count = count + 1;
	    }
	 }
	 if (count ==2)
	 {
	  
	    prime = prime + i + " ";
	 }	
      }	
     
      System.out.println(prime);
   }
}