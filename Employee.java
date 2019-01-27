package SalaryProgram;
import java.util.*;
public class Employee 
{
	
	public static void main(String[] args) {
	System.out.println("--------------------------------WELCOME TO OUR PROFILE PAGE-----------------------------");       
	System.out.println("\n\n\n");   
	                                                              
	String arr[][]= {{"101","piyush","engineer","20000","3000","1200"},{"102","prince","software engineer",
		"25000","5000","2000"},{"103","shivam","clerk","18500","2500","1000"},{"104","anshuman","programmer",
			"21000","3000","1200"},{"105","rahul","manager","40000","12000","3500"},{"106","raghu","software engineer"
				,"25450","5000","2000"} };
	String  arr1[][]= {{"engineer","e","2500"},{"software engineer","s","2500"},{"clerk","c","1800"}
	,{"programmer","p","4000"},{"manager","m","4000"},{"software engineer","s","2500"} };
	String ar[][]= {{"jean","300"},{"shirt","400"},{"jacket","1000"},{"shoes","1500"}};
	
	//this forloop is for password and username is wrong or right 
	for( int x=0;x<3;x++)
	{ 
		String arr2[]= {"piyush","devin"};
		String name,pass;
		System.out.println("Enter the username you have");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		System.out.println("Enter the password");
		pass=obj.nextLine();
		
	
	if(arr2[0].equals(name) && arr2[1].equals(pass))  //.equals is to check the equality.
	{    int id;
	     System.out.println("\n\n"); 
		System.out.println("Enter employ id to see the information");
		id=obj.nextInt();
		 System.out.println("\n\n\n"); 
		
		switch(id)
		{
		case 101:
		System.out.println("Name of the employ is " + arr[0][1]);
		System.out.println("Desigination in the company " + arr[0][2]);
		System.out.println("Basic salary = " + arr[0][3]);
		System.out.println("HRA salary = " + arr[0][4]);
		System.out.println("IT = " + arr[0][5]);
		System.out.println("DA = " + arr1[0][2]);
		 System.out.println("\n\n"); 
		
		int gross;
		int b=Integer.parseInt(arr[0][3]);  //integer.parseInt is to converting one data type to another
		int c=Integer.parseInt(arr[0][4]);
		int d=Integer.parseInt(arr1[0][2]);
		int e=Integer.parseInt(arr[0][5]);
		gross=b+c+d-e;
		System.out.println("Gross salart is = " + gross);
		int gross_=(20*gross)/100;
		System.out.println("20 % of gross salary  = " + gross_);
		gross=(gross-gross_);
		System.out.println("After deduction of 20 % gross salary is  = " + gross);
		if (gross>b)
		{ System.out.println("                      ---------------------------Now its shooping time---------------------------------");
		if(gross>b)
		{
			int grossa=gross-b;
			 System.out.println("\n\n"); 
			System.out.println("You have extra " +  grossa + " rupee for shopping");
			
			//these two forloops are to display the shopping items array
			for(int q=0;q<ar.length;q++)
			{
				for(int r=0;r<ar[q].length;r++)
				{
					System.out.print(ar[q][r]+"   ");
				}
				System.out.print("\n");
			}
			
			String item;
			
			System.out.println("Enter the item you want to buy");
			Scanner obj1=new Scanner(System.in);
			item=obj1.nextLine();
		
			switch(item)
			{
			case "jean":
				System.out.println("Cost of the jean is " + ar[0][1]);
				int price3=Integer.parseInt(ar[0][1]);
				if(grossa>price3)
				{
					grossa=grossa-price3;
					System.out.println("Balance left for shopping " + grossa);
					System.out.println("Thankyou for shopping,visit again");
				}
				else
					System.out.println("You dont have enough balance for shopping jean");
				System.out.println("THANKYOU FOR VISITING");
				break;
				
			case "shirt":
				System.out.println("Cost of the shirt is " + ar[1][1]);
				int price3a=Integer.parseInt(ar[1][1]);
				if(grossa>price3a)
				{
					grossa=grossa-price3a;
					System.out.println("Balance left for shopping " + grossa);
					System.out.println("Thankyou for shopping,visit again");
				}
				else
					System.out.println("You dont have enough balance for shopping shirt");
				System.out.println("THANKYOU FOR VISITING ");
				break;
				
			case "jacket":
				System.out.println("Cost of the jacket is " + ar[2][1]);
				int price3b=Integer.parseInt(ar[2][1]);
				if(grossa>price3b)
				{
					grossa=grossa-price3b;
					System.out.println("Balance left for shopping " + grossa);
					System.out.println("Thankyou for shopping,visit again");
				}
				else
					System.out.println("You dont have enough balance for shopping jacket");
				System.out.println("THANKYOU FOR VISITING");
				break;
			
			case "shoes":
				System.out.println("Cost of the shoes is " + ar[3][1]);
				int price3c=Integer.parseInt(ar[3][1]);
				if(grossa>price3c)
				{
					grossa=grossa-price3c;
					System.out.println("Balance left for shopping " + grossa);
					System.out.println("Thankyou for shopping,visit again");
				}
				else
					System.out.println("You dont have enough balance for shopping shoes");
				System.out.println("THANKYOU FOR VISITING");
				break;
					
			}
		
			
		}
		}
		else {
			System.out.println(gross + "/- rupees are deposited in your bank account");
		}
		break;
		case 102:
			System.out.println("Name of the employ is " + arr[1][1]);
			System.out.println("Desigination in the company " + arr[1][2]);
			System.out.println("Basic salary = " + arr[1][3]);
			System.out.println("HRA salary = " + arr[1][4]);
			System.out.println("IT = " + arr[1][5]);
			System.out.println("DA = " + arr1[1][2]);
			 System.out.println("\n\n"); 
			int gross1;
			int b1=Integer.parseInt(arr[1][3]);
			int c1=Integer.parseInt(arr[1][4]);
			int d1=Integer.parseInt(arr1[1][2]);
			int e1=Integer.parseInt(arr[1][5]);
			gross1=b1+c1+d1-e1;
			System.out.println("Gross salart is = " + gross1);
			int gross1_=(20*gross1)/100;
			System.out.println("20 % of gross salary  = " + gross1_);
			gross1=(gross1-gross1_);
			System.out.println("After deduction of 20 % gross salary is  = " + gross1);
			if (gross1>b1)
			{ System.out.println("-----------------------------Now its shooping time-------------------------------------");
			if(gross1>b1)
			{
				int gross1a=gross1-b1;
				 System.out.println("\n\n"); 
				System.out.println("You have extra " +  gross1a + " rupee for shopping");
				for(int q=0;q<ar.length;q++)
				{
					for(int r=0;r<ar[q].length;r++)
					{
						System.out.print(ar[q][r]+"   ");
					}
					System.out.print("\n");
				}
				
			     String item;
				
				System.out.println("Enter the item you want to buy");
				Scanner obj1=new Scanner(System.in);
				item=obj1.nextLine();
			
				switch(item)
				{
				case "jean":
					System.out.println("Cost of the jean is " + ar[0][1]);
					int price3=Integer.parseInt(ar[0][1]);
					if(gross1a>price3)
					{
						gross1a=gross1a-price3;
						System.out.println("Balance left for shopping " + gross1a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jean");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "shirt":
					System.out.println("Cost of the shirt is " + ar[1][1]);
					int price3a=Integer.parseInt(ar[1][1]);
					if(gross1a>price3a)
					{
						gross1a=gross1a-price3a;
						System.out.println("Balance left for shopping " + gross1a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shirt");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "jacket":
					System.out.println("Cost of the jacket is " + ar[2][1]);
					int price3b=Integer.parseInt(ar[2][1]);
					if(gross1a>price3b)
					{
						gross1a=gross1a-price3b;
						System.out.println("Balance left for shopping " + gross1a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jacket");
					System.out.println("THANKYOU FOR VISITING");
					break;
				
				case "shoes":
					System.out.println("Cost of the shoes is " + ar[3][1]);
					int price3c=Integer.parseInt(ar[3][1]);
					if(gross1a>price3c)
					{
						gross1a=gross1a-price3c;
						System.out.println("Balance left for shopping " + gross1a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shoes");
					System.out.println("THANKYOU FOR VISITING");
					break;
						
				}
			
				
			}
			}
			else {
				System.out.println(gross1 + "/- rupees are deposited in your bank account");
			}
		break;
		case 103:
			System.out.println("Name of the employ is " + arr[2][1]);
			System.out.println("Desigination in the company " + arr[2][2]);
			System.out.println("Basic salary = " + arr[2][3]);
			System.out.println("HRA salary = " + arr[2][4]);
			System.out.println("IT = " + arr[2][5]);
			System.out.println("DA = " + arr1[2][2]);
			 System.out.println("\n\n"); 
			
			int gross2;
			int b2=Integer.parseInt(arr[2][3]);
			int c2=Integer.parseInt(arr[2][4]);
			int d2=Integer.parseInt(arr1[2][2]);
			int e2=Integer.parseInt(arr[2][5]);
			gross2=b2+c2+d2-e2;
			System.out.println("Gross salart is = " + gross2);
			int gross2_=(20*gross2)/100;
			System.out.println("20 % of gross salary  = " + gross2_);
			gross2=(gross2-gross2_);
			System.out.println("After deduction of 20 % gross salary is  = " + gross2);
			if (gross2>b2)
			{ System.out.println("-------------------------------Now its shooping time-----------------------------------");
			if(gross2>b2)
			{
				int gross2a=gross2-b2;
				 System.out.println("\n\n"); 
				System.out.println("You have extra " +  gross2a + " rupee for shopping");
				for(int q=0;q<ar.length;q++)
				{
					for(int r=0;r<ar[q].length;r++)
					{
						System.out.print(ar[q][r]+"   ");
					}
					System.out.print("\n");
				}
				
                String item;
				
				System.out.println("Enter the item you want to buy");
				Scanner obj1=new Scanner(System.in);
				item=obj1.nextLine();
			
				switch(item)
				{
				case "jean":
					System.out.println("Cost of the jean is " + ar[0][1]);
					int price3=Integer.parseInt(ar[0][1]);
					if(gross2a>price3)
					{
						gross2a=gross2a-price3;
						System.out.println("Balance left for shopping " + gross2a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jean");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "shirt":
					System.out.println("Cost of the shirt is " + ar[1][1]);
					int price3a=Integer.parseInt(ar[1][1]);
					if(gross2a>price3a)
					{
						gross2a=gross2a-price3a;
						System.out.println("Balance left for shopping " + gross2a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shirt");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "jacket":
					System.out.println("Cost of the jacket is " + ar[2][1]);
					int price3b=Integer.parseInt(ar[2][1]);
					if(gross2a>price3b)
					{
						gross2a=gross2a-price3b;
						System.out.println("Balance left for shopping " + gross2a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jacket");
					System.out.println("THANKYOU FOR VISITING");
					break;
				
				case "shoes":
					System.out.println("Cost of the shoes is " + ar[3][1]);
					int price3c=Integer.parseInt(ar[3][1]);
					if(gross2a>price3c)
					{
						gross2a=gross2a-price3c;
						System.out.println("Balance left for shopping " + gross2a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shoes");
					System.out.println("THANKYOU FOR VISITING");
					break;
						
				}
			
			
			}
			}
			else {
				System.out.println(gross2 + "/- rupees are deposited in your bank account");
			}
		break;
		case 104:
			System.out.println("Name of the employ is " + arr[3][1]);
			System.out.println("Desigination in the company " + arr[3][2]);
			System.out.println("Basic salary = " + arr[3][3]);
			System.out.println("HRA salary = " + arr[3][4]);
			System.out.println("IT = " + arr[3][5]);
			System.out.println("DA = " + arr1[3][2]);
			 System.out.println("\n\n"); 
			int gross3;
			int b3=Integer.parseInt(arr[3][3]);
			int c3=Integer.parseInt(arr[3][4]);
			int d3=Integer.parseInt(arr1[3][2]);
			int e3=Integer.parseInt(arr[3][5]);
			gross3=b3+c3+d3-e3;
			System.out.println("Gross salart is = " + gross3);
			int gross3_=(20*gross3)/100;
			System.out.println("20 % of gross salary  = " + gross3_);
			gross3=(gross3-gross3_);
			System.out.println("After deduction of 20 % gross salary is  = " + gross3);
			if (gross3>b3)
			{ System.out.println("-------------------------------Now its shooping time------------------------------");
			if(gross3>b3)
			{
				int gross3a=gross3-b3;
				 System.out.println("\n\n"); 
				System.out.println("You have extra " +  gross3a + " rupee for shopping");
				for(int q=0;q<ar.length;q++)
				{
					for(int r=0;r<ar[q].length;r++)
					{
						System.out.print(ar[q][r]+"   ");
					}
					System.out.print("\n");
				}
				
				//this next portion is to enter the item u wana shop .in this there is nesting switch
				
              
				String item;
				
				System.out.println("Enter the item you want to buy");
				Scanner obj1=new Scanner(System.in);
				item=obj1.nextLine();
			
				switch(item)
				{
				case "jean":
					System.out.println("Cost of the jean is " + ar[0][1]);
					int price3=Integer.parseInt(ar[0][1]);
					if(gross3a>price3)
					{
						gross3a=gross3a-price3;
						System.out.println("Balance left for shopping " + gross3a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jean");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "shirt":
					System.out.println("Cost of the shirt is " + ar[1][1]);
					int price3a=Integer.parseInt(ar[1][1]);
					if(gross3a>price3a)
					{
						gross3a=gross3a-price3a;
						System.out.println("Balance left for shopping " + gross3a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shirt");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "jacket":
					System.out.println("Cost of the jacket is " + ar[2][1]);
					int price3b=Integer.parseInt(ar[2][1]);
					if(gross3a>price3b)
					{
						gross3a=gross3a-price3b;
						System.out.println("Balance left for shopping " + gross3a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jacket");
					System.out.println("THANKYOU FOR VISITING");
					break;
				
				case "shoes":
					System.out.println("Cost of the shoes is " + ar[3][1]);
					int price3c=Integer.parseInt(ar[3][1]);
					if(gross3a>price3c)
					{
						gross3a=gross3a-price3c;
						System.out.println("Balance left for shopping " + gross3a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shoes");
					System.out.println("THANKYOU FOR VISITING");
					break;
						
				}
			
			}
			}

			else {
				System.out.println(gross3 + "/- rupees are deposited in your bank account");
			}
		break;
		case 105:
			System.out.println("Name of the employ is " + arr[4][1]);
			System.out.println("Desigination in the company " + arr[4][2]);
			System.out.println("Basic salary = " + arr[4][3]);
			System.out.println("HRA salary = " + arr[4][4]);
			System.out.println("IT = " + arr[4][5]);
			System.out.println("DA = " + arr1[4][2]);
			 System.out.println("\n\n"); 			
			int gross4;
			int b4=Integer.parseInt(arr[4][3]);
			int c4=Integer.parseInt(arr[4][4]);
			int d4=Integer.parseInt(arr1[4][2]);
			int e4=Integer.parseInt(arr[4][5]);
			gross4=b4+c4+d4-e4;
		    System.out.println("Gross salart is = " + gross4);
		    int gross4_=(20*gross4)/100;
			System.out.println("20 % of gross salary  = " + gross4_);
			gross4=(gross4-gross4_);
			System.out.println("After deduction of 20 % gross salary is  = " + gross4);
			if (gross4>b4)
			{ System.out.println("------------------------Now its shooping time-------------------------------------");
			if(gross4>b4)
			{
				int gross4a=gross4-b4;
				 System.out.println("\n\n"); 
				System.out.println("You have extra " +  gross4a + " rupee for shopping");
				for(int q=0;q<ar.length;q++)
				{
					for(int r=0;r<ar[q].length;r++)
					{
						System.out.print(ar[q][r]+"   ");
					}
					System.out.print("\n");
				}
				
				//now
				String item;
				System.out.println("Enter the item you want to buy");
				Scanner obj1=new Scanner(System.in);
				item=obj1.nextLine();
				switch(item)
				{
				case "jean":
					System.out.println("Cost of the jean is " + ar[0][1]);
					int price3=Integer.parseInt(ar[0][1]);
					if(gross4a>price3)
					{
						gross4a=gross4a-price3;
						System.out.println("Balance left for shopping " + gross4a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jean");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "shirt":
					System.out.println("Cost of the shirt is " + ar[1][1]);
					int price3a=Integer.parseInt(ar[1][1]);
					if(gross4a>price3a)
					{
						gross4a=gross4a-price3a;
						System.out.println("Balance left for shopping " + gross4a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shirt");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "jacket":
					System.out.println("Cost of the jacket is " + ar[2][1]);
					int price3b=Integer.parseInt(ar[2][1]);
					if(gross4a>price3b)
					{
						gross4a=gross4a-price3b;
						System.out.println("Balance left for shopping " + gross4a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jacket");
					System.out.println("THANKYOU FOR VISITING");
					break;
				
				case "shoes":
					System.out.println("Cost of the shoes is " + ar[3][1]);
					int price3c=Integer.parseInt(ar[3][1]);
					if(gross4a>price3c)
					{
						gross4a=gross4a-price3c;
						System.out.println("Balance left for shopping " + gross4a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shoes");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				}
				
				
				
			}
			
			}
			else {
				System.out.println(gross4 + "/- rupees are deposited in your bank account");
			}
		break;
		case 106:
			System.out.println("Name of the employ is " + arr[5][1]);
			System.out.println("DSesigination in the company " + arr[5][2]);
			System.out.println("Bsic salary = " + arr[5][3]);
			System.out.println("HRA salary = " + arr[5][4]);
			System.out.println("IT = " + arr[5][5]);
			System.out.println("DA = " + arr1[5][2]);
			 System.out.println("\n\n"); 
			
			int gross5;
			int b5=Integer.parseInt(arr[2][3]);
			int c5=Integer.parseInt(arr[2][4]);
			int d5=Integer.parseInt(arr1[2][2]);
			int e5=Integer.parseInt(arr[2][5]);
			gross5=b5+c5+d5-e5;
			System.out.println("Gross salart is = " + gross5);
			int gross5_=(20*gross5)/100;
			System.out.println("20 % of gross salary  = " + gross5_);
			gross5=(gross5-gross5_);
			System.out.println("After deduction of 20 % gross salary is  = " + gross5);
			if (gross5>b5)
			{ System.out.println("-----------------------Now its shooping time---------------------------");
			if(gross5>b5)
			{
				int gross5a=gross5-b5;
				 System.out.println("\n\n"); 
				System.out.println("You have extra " +  gross5a + " rupee for shopping");
				for(int q=0;q<ar.length;q++)
				{
					for(int r=0;r<ar[q].length;r++)
					{
						System.out.print(ar[q][r]+"   ");
					}
					System.out.print("\n");
				}
				
                 String item;
				
				System.out.println("Enter the item you want to buy");
				Scanner obj1=new Scanner(System.in);
				item=obj1.nextLine();
			
				switch(item)
				{
				case "jean":
					System.out.println("Cost of the jean is " + ar[0][1]);
					int price3=Integer.parseInt(ar[0][1]);
					if(gross5a>price3)
					{
						gross5a=gross5a-price3;
						System.out.println("Balance left for shopping " + gross5a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jean");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "shirt":
					System.out.println("Cost of the shirt is " + ar[1][1]);
					int price3a=Integer.parseInt(ar[1][1]);
					if(gross5a>price3a)
					{
						gross5a=gross5a-price3a;
						System.out.println("Balance left for shopping " + gross5a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shirt");
					System.out.println("THANKYOU FOR VISITING");
					break;
					
				case "jacket":
					System.out.println("Cost of the jacket is " + ar[2][1]);
					int price3b=Integer.parseInt(ar[2][1]);
					if(gross5a>price3b)
					{
						gross5a=gross5a-price3b;
						System.out.println("Balance left for shopping " + gross5a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping jacket");
					System.out.println("THANKYOU FOR VISITING");
					break;
				
				case "shoes":
					System.out.println("Cost of the shoes is " + ar[3][1]);
					int price3c=Integer.parseInt(ar[3][1]);
					if(gross5a>price3c)
					{
						gross5a=gross5a-price3c;
						System.out.println("Balance left for shopping " + gross5a);
						System.out.println("Thankyou for shopping,visit again");
					}
					else
						System.out.println("You dont have enough balance for shopping shoes");
					System.out.println("THANKYOU FOR VISITING");
					break;
						
				}
				
				
				
				
			
			}
			}
			else {
				System.out.println(gross5 + "/- rupees are deposited in your bank account");
			}
		break;
		
		
		}
		break;
	}
	
	else 
		 System.out.println("\n\n"); 
		System.out.println("You have " + (2-x) + " more tries, please enter correctly ");
	}
	
	
	}

	
}
