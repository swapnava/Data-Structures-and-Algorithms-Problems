package string;

import java.util.Scanner;

public class CountAndSay {
	
	public static String CountandSay(int n){
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		String str="11";
		for(int i=3;i<=n;i++) {
			String temp="";
			str+='&';
			int count=1;
			for(int j=1;j<str.length();j++) {
				if(str.charAt(j)!=str.charAt(j-1)) {
					temp+=count;
					temp+=str.charAt(j-1);
					count=1;
				}
				else count++;
			}
			str=temp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(CountandSay(n));
	}

}
