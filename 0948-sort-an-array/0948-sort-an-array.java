class Solution {
    public int[] sortArray(int[] essy) {
        Arrays.sort(essy);

        for (int x : essy){
            System.out.print(x + " ");
        }
        return essy;
    }
}