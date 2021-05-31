package test;

public class test
{
 public static void main(String args[])
 {
	 try
	 {
	 int a=12/4;
	 System.out.println("value :"+a);
	    try
	    {
	    String str=null;
	    System.out.println(str.length());
	       try
	       {
	       int arr[]= {2,4,6,8,3,5};
	       System.out.println(arr[2]);
	       }catch(ArrayIndexOutOfBoundsException e)
	       {
	    	   System.out.print("index size is 5");
	       }
	    }catch(NullPointerException e)
	    {
	    	System.out.println("enter the correct string");
	    }
	 }catch(ArithmeticException e)
	 {
		 System.out.println("Enter the correct value :");
	 }
 }
}
