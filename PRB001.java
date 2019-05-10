import java.util.Scanner;
public class PRB001 {
	public static void main(String[] args) {
		while(1==1){
			Scanner input = new Scanner(System.in);
			System.out.print("Board size: ");
			String size = input.nextLine();
			int width = Integer.parseInt(size);
			if(width<0){
				System.out.println();
				System.out.println("Invalid Board");
				System.out.println();
			}
			else{
				System.out.println();
				for(int x = 0; x < width; x++){
					for(int y = 0; y < width; y++)
						System.out.print("# ");
					System.out.println();
				}
				System.out.println();
			}
		}
	}
}
