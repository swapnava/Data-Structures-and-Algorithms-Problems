public class ArrayOf012{
    public static void main(String[] args) {
    int[] arr=new int[]{0,1,1,1,2,2,0,1,2,1,0,1};
		boolean invalid = false;
		int c0=0, c1=0, c2=0;
		for(int i:arr){
			if(i==0){
				c0++;
			}else if(i==1){
				c1++;
			}else if(i==2){
				c2++;
			}
		}
		if(!invalid){
			for(int i=0;i<arr.length;i++) {
				if(c0>0) {
					arr[i]=0;
					c0--;
				}
				else if(c1>0) {
					arr[i]=1;
					c1--;
				}
				else if(c2>0) {
					arr[i]=2;
					c2--;
				}
			}
			for(int j:arr){
				System.out.print(j+" ");
			}
		}
		else{
			System.out.print("Invalid data");
		}
	}
}