public class NegativeElements{
    public static void main(String[] args) {
        int[] arr=new int[]{-1,8,9,7,-2,3,-7,-9,4,-2,-10};
        int j=arr.length-1, i=0;
        while(i<=j){
            if(arr[i]>0 && arr[j]<0){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
            else if(arr[i]>0 && arr[j]>0){
                j--;
            }else {
                i++;
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}