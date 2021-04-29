public class FloydTortoiseAndHareAlgo{
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,2,4,2};
        int tortoise = arr[0];
        int hare = arr[0];
        do{
            tortoise = arr[tortoise];
            hare = arr[arr[tortoise]];
        }while(tortoise!=hare);

        tortoise = arr[0];
        while(hare!=tortoise){
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        System.out.println(hare);
    }
}