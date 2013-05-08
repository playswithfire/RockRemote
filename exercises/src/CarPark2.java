import java.util.Scanner;

public class CarPark2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float arrival;
		float stay;
		float ammountDue;
		float departure;
		System.out.println("Carpark open from 09:00 to 22.00");
		System.out.println("Enter time of arrival at carpark 24hr format please");
		System.out.println("Enter time of departure from  carpark 24hr format please");
		arrival = input.nextFloat();
		departure=input.nextFloat();
		stay=departure-arrival;
		if (stay>10.0f) 
			{ammountDue=7.0f;}
		else if (stay<=2.0f)
			{ammountDue=3.0f;}
		else {ammountDue=3.0f+(stay-2.0f)*0.50f;}
		System.out.println("ammountDue"+ "€"+ammountDue);
		
		
		
				
			}
	}

