public class KthSmallestElementArray{

    //Using Quick sort to sort the Array
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];
     
        int i = (low - 1);
 
        for(int j = low; j <= high - 1; j++)
        {
         
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
         
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
 

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        int k = 3;
        quickSort(arr, 0, n - 1);
        System.out.print(arr[k-1]);
    }
}