public class Best2 {
    public int maxProfit(int[] prices) {
        // 이전 문제와 비슷하나, 달라진 점은 사고 파는게 여러 번 가능하단 거다.
        // 단, 최대 한 개만 보유할 수 있다.

        // 구매와 동시에 판매가 가능하다. 결국 가장 이득을 보려면, 이득을 계속 보면 된다.

        // 1. 일단 구매한다.
        // 2. 판매가 가능하면 판매한다. -> 구매한다.
        // 3. 판매가 불가능하면 -> 구매한다.
        // 4. 부를 쌓는다.

        int buy = prices[0];
        int benefit = 0;
        for (int i=1; i<prices.length; i++){
            if (buy < prices[i]) benefit += prices[i] - buy;
            buy = prices[i];
        }

        return benefit;


    }
}
