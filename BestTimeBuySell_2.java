public class BestTimeBuySell_2 {
    public int maxProfit(int[] prices) {
      int buyprice=Integer.MAX_VALUE;
      int totalprofit=0;
      for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            totalprofit+=profit;
            buyprice=prices[i];
        }
        else{
            buyprice=prices[i];
        }
      }  
      return totalprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        BestTimeBuySell_2 obj=new BestTimeBuySell_2();
        System.out.println(obj.maxProfit(prices));
    }
}    

