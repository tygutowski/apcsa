import java.util.ArrayList;
import java.util.Scanner;


public class PRB006 {
	static String total = "";
	static int quarters = 0; static int dimes = 0; static int nickles = 0; static int pennies = 0;
	static ArrayList<Float> money = new ArrayList<Float>();
	public static void main(String[] args) {
		getTotal();
		getChange();
	}
		
		public static void getTotal(){
			int num = 1;
			Scanner input = new Scanner(System.in);
			System.out.print("How many times? ");
			String tempnum = input.nextLine();
			num = Integer.parseInt(tempnum);
			for(int i = num; i>0; i--){	
				System.out.print("");
				String temp = input.nextLine();
				temp = (temp.substring(1,temp.length()));
				float cash = Float.parseFloat(temp);
				money.add(cash);
			}
		}
		public static void getChange(){
			for(int z = 0; z < money.size(); z+=1){
				int cash = (int) (money.get(z) * 100);
				
				quarters = cash/25;
				cash %= 25;
				dimes = cash/10;
				cash %= 10;
				nickles = cash/5;
				cash %= 5;
				pennies = cash;
				
				System.out.println(
						"$" + money.get(z) + "\n" + 
						"Quarters= " + (int) quarters + "\n" +
						"Dimes= " + (int) dimes + "\n" +
			     		"Nickles= " + (int) nickles + "\n" +
						"Pennies= " + (int) pennies + "\n"
						);
		}
	}
}
