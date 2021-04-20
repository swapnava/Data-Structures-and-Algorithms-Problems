public class ReverseArray{
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,6};
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            arr[i] = arr[i]+arr[n-i-1];
            arr[n-i-1] = arr[i]-arr[n-i-1];
            arr[i] = arr[i] - arr[n-i-1];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}