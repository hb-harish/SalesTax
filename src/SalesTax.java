import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args)

	{
		//display a welcome message
		System.out.println("Welcome to the Sales Tax Calculator");
		System.out.println();
		
		
		//get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("customer number, first name, last name, sales amount and a tax code");
		String no = sc.next();
		String fname = sc.next();
		String lname = sc.next();
		double amt = sc.nextDouble();
		String tax = sc.next();
		double tax_rate =0 ;
		
		if (tax.equals("NRM"))
            tax_rate = 6; 
        else if (tax.equals("NPF"))
        	tax_rate = 0; 
        else if (tax.equals("BIZ"))
        	tax_rate = 4.5; 
        else
        	System.out.println("Invlaid Code");
		

		double totAmount = amt * (1+ (tax_rate/100));
		
		//format and display
		String message = "Customer Number\t:" + no + "\nCustomer Name\t:" + fname + " " 
				+ lname	+ "\nSales Amount\t:" + amt + "\nTax code\t:" + tax + "\nAmount Due\t:" 
				+ totAmount; 
		System.out.println(message);
	}
	
}
