class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x =0, y= 0, d =0;
        int [][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int maxDistance = 0;
        Set<String> obsSet = new HashSet<>();
        for (int[] obstacle : obstacles){
            obsSet.add(obstacle[0] + "," + obstacle[1]);
        }
        for (int command: commands){
            if (command == -1){
                d = (d + 1) % 4;
            }else if (command == -2){
                d= (d + 3) % 4; 
            }else {
                for (int i= 0; i< command; i++){
                    int cordx = x + directions[d][0];
                    int cordy = y + directions[d][1];
                    if (obsSet.contains(cordx+","+cordy)){
                        break;
                    }
                    x = cordx;
                    y = cordy;
                    maxDistance = Math.max(maxDistance, x*x + y *y);
                }
            }
        }
        return maxDistance;
    }
}