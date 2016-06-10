
import java.io.*;
public class Calculator
{	int a,b,r;
	public void getdata() throws Exception
	{
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.print("Enter first number: ");
		String str=rd.readLine();
		a=Integer.parseInt(str);
		System.out.print("Enter second number: ");
		str=rd.readLine();
		b=Integer.parseInt(str);
		}
		catch(IOException e)
		{
	         e.printStackTrace();
		}

	}
	public void sum()
	{
		r=a+b;
		System.out.println("Sum is "+r);
	}
	public void sub()
	{
		r=a-b;
		System.out.println("Subtraction is "+r);
	}
	public void mul()
	{
		r=a*b;
		System.out.println("Multiplication is "+r);
	}
	public void div()
	{
		r=a/b;
		System.out.println("Division is"+r);
	}
	public void Displayoptions()
	{
		System.out.println("Welcome to Calculator Application");
		System.out.println("Operator 	Operation");
		System.out.println("+		Sum");
		System.out.println("-		Subtraction");
		System.out.println("*		Multipliation");
		System.out.println("/		Division");
	}
	public static void main(String args[]) throws Exception
	{	char c;
							
		try
		{ 
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		Calculator C1=new Calculator();
		do
		{
			C1.Displayoptions();
			System.out.print("Enter operation you want to perform");
			String str;
			str=rd.readLine();
			c = str.charAt(0);
			switch (c)
			{
			case '+':
				C1.getdata();	
				C1.sum();
				break;
			case '-':
				C1.getdata();	
				C1.sub();
				break;
			case '*':
				C1.getdata();	
				C1.mul();
				break;
			case '/':
				C1.getdata();	
				C1.div();
				break;
			default:
			System.out.println("You have selected wrong option");
			}
			System.out.println("Do you want to use calculator again (Y/N)");
			str=rd.readLine();
			c = str.charAt(0);
			 
		}while(c=='y' ||c=='Y');

		}catch (IOException e)
		{	e.printStackTrace();
		}			

	}

}