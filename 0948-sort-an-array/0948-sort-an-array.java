class Solution {
    public int[] sortArray(int[] essy) {
        Arrays.sort(essy);

        System.out.println("Sorted Array is:");

        for (int x : essy){
            System.out.print(x + " ");
        }
        return essy;
    }
}