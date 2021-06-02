
public class BuyAndSellStock {

	public static void main(String[] args) {
		int[] stockprice=new int[] {7,1,2,7,6,4};
		int maxprofit=0, minprice=Integer.MAX_VALUE, buyon=0, sellon=0;
		for(int i=0;i<(stockprice.length-1);i++) {
			if(stockprice[i]<minprice) {
				minprice=stockprice[i];
				buyon=i+1;
			}
			else if(stockprice[i]-minprice>maxprofit) {
				maxprofit=stockprice[i]-minprice;
				sellon=i+1;
			}
		}
		System.out.println("Buy on Day "+buyon+" \nand \nSell on Day "+sellon+"\nMax Profit: "+maxprofit);
	}

}
