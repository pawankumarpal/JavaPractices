package arrays;

public class BestTimeToSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeToSellStock btts = new BestTimeToSellStock();
		
		int [] prices={7,1,5,3,6,4};
		System.out.println(btts.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int price : prices) {
			if (price < minPrice) {//yes,yes
				minPrice = price;//7,1
			} else if (price - minPrice > maxProfit) {//5-1=4/3-1=2x,6-1=5
				maxProfit = price - minPrice;//4,5
			}
		}
		return maxProfit; //5
	}
}
