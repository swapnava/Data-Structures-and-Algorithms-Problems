public class MinimizeMaxDiffBtwnHeights{
    public static void main(String[] args) {
        int[] arr=new int[]{1,14,10,14,15,14};
        int k=6, n = arr.length;
        java.util.Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int small = arr[0]+k;
        int big = arr[n-1]-k;
        if (small>big){
            int temp=small;
            small = big;
            big = temp;
        }
        for(int i=1;i<n-1;i++){
            int sub = arr[i] - k;
            int add = arr[i] + k;
            if(sub >= small || add <= big){
                continue;
            }
            if (big - sub <= add - small){
                small = sub;
            }
            else
                big = add;
        }
        System.out.println("Maximum difference is: "+Math.min(ans, big-small));
    }
}