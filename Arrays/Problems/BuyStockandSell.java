public class BuyStockandSell{
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int profit = 0;
        int buy_price = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] <= buy_price){
                buy_price = arr[i];
                continue;
            }
            profit = Math.max(profit,arr[i] - buy_price );
        }
        System.out.println(profit);
    }
}