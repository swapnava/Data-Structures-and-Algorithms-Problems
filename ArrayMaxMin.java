public class ArrayMaxMin{
    public static void main(String[] args) {
        int[] arr=new int[]{-5,5,1,2,10,5,6,25};
        int n=arr.length;
        int max = arr[0]>arr[1]?arr[0]:arr[1];
        int min = arr[0]<arr[1]?arr[0]:arr[1];
        for(int i=2;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: "+max+"\nMinimum number is: "+min);
    }
}