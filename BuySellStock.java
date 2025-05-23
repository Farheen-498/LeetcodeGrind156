public class BuySellStock {
    public static int maxProfit(int [] prices){
        int minPrice= Integer.MAX_VALUE;
        int profit=0;
        for(int price: prices){
            if(price < minPrice){
                minPrice= price;
            } else if(price - minPrice > profit){
                profit= price - minPrice;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
