import java.util.Scanner;


public class PRB006 {
	public static void main(String[] args) {
		int num = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("How many times? ");
		String tempnum = input.nextLine();
		num = Integer.parseInt(tempnum);
		int quarters = 0; int dimes = 0; int nickles = 0; int pennies = 0;
		String total = "";
		for(int i = num; i>0; i--){	
	
			System.out.print("");
			total += input.nextLine();
			
		}
			

		for(int z = 0; z<total.length(); z+=5){
			String temp = total.substring(z+1, z+5);
			
			float money = Float.parseFloat(temp);
			int cash = (int) (money * 100);
			
			quarters = cash/25;
			cash %= 25;
			dimes = cash/10;
			cash %= 10;
			nickles = cash/5;
			cash %= 5;
			pennies = cash;
			
			System.out.println(
					"$" + money + "\n" + 
					"Quarters= " + (int) quarters + "\n" +
					"Dimes= " + (int) dimes + "\n" +
		     		"Nickles= " + (int) nickles + "\n" +
					"Pennies= " + (int) pennies + "\n"
					);
		}
	}
}
