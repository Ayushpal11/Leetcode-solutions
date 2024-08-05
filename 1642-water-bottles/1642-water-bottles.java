class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int numConsume = 0;
       while (numBottles >= numExchange){
        numConsume += numExchange;
        numBottles -= numExchange;
        numBottles++;
       }
       return numConsume + numBottles;
    }
}