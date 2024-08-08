class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        int rMinMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rMin = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                rMin = Math.min(rMin, matrix[i][j]);
            }
            rMinMax = Math.max(rMinMax, rMin);
        }

        
        int cMaxMin = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int cMax = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                cMax = Math.max(cMax, matrix[j][i]);
            }
            cMaxMin = Math.min(cMaxMin, cMax);
        }
        if (rMinMax == cMaxMin){
            return new ArrayList<>(Arrays.asList(rMinMax));
        }

        return new ArrayList<>();
    }
}