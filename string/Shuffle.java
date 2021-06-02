
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		String shuffle=in.next();
		boolean possible=true;
		int i=0, j=0, k=0;
		while(k<shuffle.length()) {
			if(i<s1.length() && s1.charAt(i)==shuffle.charAt(k))
				i++;
			else if(j<s2.length() && s2.charAt(j)==shuffle.charAt(k))
				j++;
			else {
				possible=false;
				break;
			}
			k++;
		}
		if (i<s1.length() || j<s2.length())
			possible=false;
		if(possible)
			System.out.println("Shuffle: True");
		else
			System.out.println("Shuffle: False");
	}
}
