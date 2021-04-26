import java.util.ArrayList;
public class MatrixSpiralTraversal{
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        ArrayList<Integer> ans=new ArrayList<>();
        ans = spiralElements(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> spiralElements(int[][] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length, m=arr[0].length,l=0, k=0;
        while(l<m && k<n){
            for(int i=l;i<m;i++){
                ans.add(arr[k][i]);
            }
            k++;
            for(int i=k;i<n;i++){
                ans.add(arr[i][m-1]);
            }
            m--;
            if(l<m){
                for(int i=m-1;i>=l;i--){
                    ans.add(arr[n-1][i]);
                }
                n--;
            }
            if(k<n){
                for(int i=n-1;i>=k;i--){
                    ans.add(arr[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}