import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PRB009 {
	static String total = "";
	static int num = 1;
	static int quarters = 0; static int dimes = 0; static int nickles = 0; static int pennies = 0;
	static ArrayList<String> anagramlist = new ArrayList<String>();
	public static void main(String[] args) {
		getWords();
		getAnagram();
	}
		
		public static void getWords(){
			Scanner input = new Scanner(System.in);
			System.out.print("How many names? ");
			String tempnum = input.nextLine();
			System.out.println("");
			num = Integer.parseInt(tempnum);
			for(int i = num; i>0; i--){
				String temp = input.nextLine();
    			anagramlist.add(temp);
			}
    			System.out.println("");
		}
		public static void getAnagram(){
			for(int x = 0; x < anagramlist.size(); x++) {
					String temporary = anagramlist.get(x);
					String[] templist = temporary.split("\\|");
					char[] word1 = templist[0].replaceAll("[\\s]", "").toCharArray();
				    char[] word2 = templist[1].replaceAll("[\\s]", "").toCharArray();
				    Arrays.sort(word1);
				    Arrays.sort(word2);
					if(templist[0].equals(templist[1]))
			    		System.out.println(anagramlist.get(x)+" = "+"NOT AN ANAGRAM");
					else if(Arrays.equals(word1, word2))
				   		System.out.println(anagramlist.get(x)+" = "+"ANAGRAM");
					else
				   		System.out.println(anagramlist.get(x)+" = "+"NOT AN ANAGRAM");
			}
		}
	}
