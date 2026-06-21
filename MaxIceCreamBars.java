public class MaxIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        int count = 0;
        for (int cost = 1; cost <= maxCost && coins >= cost; cost++) {
            if (freq[cost] == 0) continue;
            int canBuy = Math.min(freq[cost], coins / cost);
            count += canBuy;
            coins -= canBuy * cost;
        }
        return count;
    }

    public static void main(String[] args) {
        MaxIceCreamBars sol = new MaxIceCreamBars();

        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;

        int result = sol.maxIceCream(costs, coins);

        System.out.println("Maximum Ice Creams: " + result);
    }    
}     

