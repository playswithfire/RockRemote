import java.util.Scanner;
public class CarPark {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float stay;
		float ammountDue;
		System.out.println("Enter duration of stay in car park");
		stay = input.nextFloat();
		
		if (stay>10.0f) 
			{ammountDue=7.0f;}
		else if (stay<=2.0f)
			{ammountDue=3.0f;}
		else {ammountDue=3.0f+(stay-2.0f)*0.50f;}
		System.out.println("€"+ammountDue);
		
		
		
				
			}
	}

