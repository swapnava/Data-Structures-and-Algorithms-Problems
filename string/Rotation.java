package string;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String str2=in.next();
		String temp=str+""+str;
		if(temp.contains(str2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
