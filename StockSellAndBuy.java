public class StockSellAndBuy {
    public static void stockProfit(int prices[]){
        int profit=0;
        int min=0;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int diff=prices[j]-prices[i];
        //         profit=Math.max(profit,diff);
        //     }
        // }
        for(int i=1;i<prices.length-1;i++){
            if(prices[i]<prices[min]){
                min=i;
            }
        }
        for(int i=min+1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-prices[min]);
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int prices[]={2,5,14,3,1};
        stockProfit(prices);
    }
}
