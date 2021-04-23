import java.util.HashSet;
public class UnionAndIntersection{
    public static void main(String[] args) {
        int[] arr1=new int[]{1,4,5,8,9,18,28};
        int[] arr2=new int[]{2,3,5,9,28};
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        System.out.println("Union of two arrays---");
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();
        set.clear();
        System.out.println("Intersection of two arrays---");
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i)) System.out.print(i+" ");
        }
    }
}