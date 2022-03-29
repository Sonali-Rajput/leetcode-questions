public class sellstock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        
    }
    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        //System.out.println(minprice);
        int maxprofit = 0;
        for (int index = 0; index < prices.length; index++) { 
            if (prices[index] < minprice) //check for the minimum price to buy 
                minprice = prices[index]; //set the minimumprice from the index 
            else if (prices[index] - minprice > maxprofit) //for selling as maximum profit
                maxprofit = prices[index] - minprice; //set the max profit of product
        }
        return maxprofit; //returning the maximum profit
    }
    
}
