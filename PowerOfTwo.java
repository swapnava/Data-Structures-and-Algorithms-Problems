import java.util.Scanner;
public class PowerOfTwo{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String output;
        if(num<0){
            System.out.println("Number too small");
        }
        else if(num>32767){
            System.out.println("Number too large");
        }
        else{
            output = powerOfTwo(num) ? "Yes" : "No";
            System.out.println(output);
        }
    }
    static boolean powerOfTwo (int num)
    {
        return num!=0 && ((num&(num-1)) == 0);
         
    }
}
