import java.util.Scanner;

public class PanlindromString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value: ");
		String str = sc.next();
		String rev = "";
		for(int i = str.length() -1; i >= 0; i--){
			rev = rev + str.charAt(i);
		}

		if(str.equalsIgnoreCase(rev)){
			System.out.println("It is palindrom "+str);
		} else {
			System.out.println("It is not a palindrom "+str);
		}

		sc.close();
	}
}