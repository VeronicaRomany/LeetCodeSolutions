class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int min = prices[0];
        int minPosition = 0;
        
        
        for(int i=1 ; i<prices.length ; i++){
            if(prices[i]<min){
                min = prices[i];
                minPosition = i;
            }
        }
        
        
        prices[minPosition] = Integer.MAX_VALUE;
        int secondmin = prices[0];
        
          for(int i=1 ; i<prices.length ; i++){
            if(prices[i]<secondmin){
                secondmin = prices[i];
            }
        }
        
        return money >= min + secondmin ? money - (min+secondmin) : money;
        
        
    }
}