import java.util.Scanner;
public class Currency {


    public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the amount");
	float amount=sc.nextFloat();
	System.out.println("Please enter your choice");
	System.out.println("Press 1 for INR(Indian Rupee) to US Dollars");
	System.out.println("Press 2 for UD Dollars to INR(Indian Rupee) Dollars");

    int x=sc.nextInt();
	switch(x)
	{

		case 1:
		{	
			amount=amount/83;
			System.out.println(amount+" US Dollars");
		break;
		}
		case 2:
		{	
			amount=amount*83;
			System.out.println(amount+" INR");
		break;
		}
        default:


			System.out.println("Invalid Choice");
			break;
	}
    }
}

