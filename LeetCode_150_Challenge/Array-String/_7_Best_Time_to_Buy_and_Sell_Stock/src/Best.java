public class Best {
    public int maxProfit(int[] prices) {
        // 실제로 Person 이 장을 본다고 가정해보자.
        // 어차피 무르기가 가능하니 일단 구매를 하고 본다.

        // 1. 일단 처음부터 매입한다.
        // 2. 만약 매도했을때 이득이 생기면 benefit 에 저장한다. + 매입가격이 더 싸다면 매입가를 바꾼다.
        // 3. 매도했을때 이득이 benefit 보다 크면 benefit 에 저장한다.
        // 4. benefit < 0 return 0

        int buy = prices[0];
        int benefit = 0;

        for (int i=1; i<prices.length; i++){

            if (prices[i] > buy) {
                int gap = prices[i] - buy;
                // 팔 가치가 있다.
                if (benefit < gap) benefit = gap;
            }
            else buy = prices[i];

        }

        return benefit > 0 ? benefit: 0;


    }
}
