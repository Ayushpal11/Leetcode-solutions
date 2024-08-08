class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dir = new int[][] {{0,1}, {1,0} , {0, -1}, {-1,0}};
        int[][] traverse = new int[rows*cols][2];
        int index = 0;
        for (int move = 1, direction = 0; index < rows * cols;){
            for (int i = 0; i<2;i++){
                for (int j = 0;j<move;j++){
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                        traverse[index][0] = rStart;
                        traverse[index][1] = cStart;
                        index++;
                    }
                    rStart += dir[direction][0];
                    cStart += dir[direction][1];
                }
                direction = (direction + 1) % 4;
            }
            ++move;
        }
        return traverse;
    }
}