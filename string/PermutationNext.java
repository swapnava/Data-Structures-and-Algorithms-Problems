package string;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationNext {
	
	public static void findNextSmall(int[] arr, int n) {
		int i;
		for(i=n-1;i>0;i--) {
			if(arr[i]>arr[i-1]) {
				break;
			}
		}
		if(i==0) {
			System.out.println("Not Possible");
		}
		else {
			int x=arr[i-1], min=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j] > x && arr[j]<arr[min])
					min=j;
			}
			
			int temp = arr[i-1];
			arr[i-1]=arr[min];
			arr[min]=temp;
			
			Arrays.sort(arr,i,n);
			for(int num:arr)
				System.out.print(num+"");
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]=new int[] {9,2,4,8,6,1};
		int n=arr.length;
		findNextSmall(arr,n);
	}

}
