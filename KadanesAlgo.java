public class KadanesAlgo{
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,-2,5};
        int currentSum=0, start=0, end=0, index=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum>maxSum){
                maxSum = currentSum;
                start=index;
                end=i;
            }
            if(currentSum<0){
                currentSum=0;
                index=i+1;
            }
        }
        System.out.println("The subarray is:");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The sum is: "+maxSum);
    }
}