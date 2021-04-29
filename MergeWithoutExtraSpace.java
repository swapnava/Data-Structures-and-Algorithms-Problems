public class MergeWithoutExtraSpace{
    public static void main(String[] args) {
        int[] arr1=new int[]{1,4,5,9};
        int[] arr2=new int[]{2,7,8,10,12};
        int n=arr1.length, m=arr2.length, i=0, j=0;
        int gap = n+m;
        for(gap = nextGap(gap);gap>0;gap=nextGap(gap)){
            for(i=0;i+gap<n;i++){
                if(arr1[i]>arr1[i+gap])
                    swap(arr1,i,j);
            }
            for(j = (gap>n)?(gap-n):0; i<n && j<m; i++,j++){
                if(arr1[i]>arr2[j]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            if(j<m){
                for(j=0;j+gap<m;j++){
                    if(arr2[j]>arr2[j+gap])
                        swap(arr2,j,j+gap);
                }
            }
        }
        for(int x:arr1)
            System.out.print(x+" ");
        for(int x:arr2)
            System.out.print(x+" ");
    }
    public static void swap(int[] arr,int n, int m){
        int temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
    static int nextGap(int gap){
        if(gap<=1){
            return 0;
        }
        return (gap/2 + gap%2);
    }
}