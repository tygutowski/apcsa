import java.util.Scanner;
public class PRB002 {
	public static void main(String[] args) {
		int num = 1;
		while(num!=0){
			Scanner input = new Scanner(System.in);
			System.out.print("How many names? ");
			String tempnum = input.nextLine();
			num = Integer.parseInt(tempnum);
			String output = "";
			for(int i = num; i>0; i--){
				String abr = "";
				System.out.print("");
				String name = input.nextLine();
				name = name.toUpperCase();
				String[] myName = name.split(" ");
			    abr += ((myName[0].charAt(0)) + "" + (myName[2].charAt(0)) + "" + (myName[1].charAt(0)));
				output += abr + "\n";
			}
			System.out.println("\n" + output);
			}
		}
	}
