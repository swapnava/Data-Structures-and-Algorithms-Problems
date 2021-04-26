public class MatrixElementSearch{
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,4,8,9,10},{11,12,17,19},{21,23,28,29}};
        boolean found=false;
        int find=10, row=0;
        int m=arr.length;
        int n=arr[row].length;
        for(int i=0;i<m;i++){
            if(find<=arr[i][n-1] && find>=arr[i][0]){
                for(int j=0;j<n;j++){
                    if(arr[i][j] == find){
                        found=true;
                        break;
                    }
                }
            }
            if(found)
                break;
            else{
                row++;
                if(row<m){
                    n=arr[row].length;
                }
            }
        }
        System.out.println(found);
    }
}