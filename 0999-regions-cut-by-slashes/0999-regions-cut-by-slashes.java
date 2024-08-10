class Solution {
    int n;
    int UP = 0;
    int RIGHT = 1;
    int DOWN = 2;
    int LEFT = 3;
    
    public int regionsBySlashes(String[] grid) {
        n = grid.length;
        int size = n * n * 4;
        DisjointSet ns = new DisjointSet(size);
        for (int i = 0; i < grid.length; i++) {
            String s = grid[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == ' ' || c == '\\') {
                    ns.union(squash(i, j, UP), squash(i, j, RIGHT));
                    ns.union(squash(i, j, DOWN), squash(i, j, LEFT));
                }
                
                if (c == ' ' || c == '/') {
                    ns.union(squash(i, j, UP), squash(i, j, LEFT));
                    ns.union(squash(i, j, DOWN), squash(i, j, RIGHT));
                }
                
                if (i > 0) {
                    ns.union(squash(i, j, UP), squash(i - 1, j, DOWN));
                }
                if (j < s.length() - 1) {
                    ns.union(squash(i, j, RIGHT), squash(i, j + 1, LEFT));
                }
                if (i < grid.length - 1) {
                    ns.union(squash(i, j, DOWN), squash(i + 1, j, UP));
                }
                if (j > 0) {
                    ns.union(squash(i, j, LEFT), squash(i, j - 1, RIGHT));
                }
            }
        }
        
        return ns.numComponents;
    }
    
    public int squash(int row, int col, int dir) {
        return col + (row * n) + (n * n * dir);
    }
    
    class DisjointSet {
        int [] pt;
        int numComponents;
        
        public DisjointSet(int size) {
            pt = new int [size];
            for (int i = 0; i < size; i++) {
                pt[i] = i;
            }
            numComponents = size;
        }
        
        public void union(int a, int b) {
            int rootA = findRoot(a);
            int rootB = findRoot(b);
            if (rootA != rootB) {
                numComponents--;
            }
            pt[rootA] = rootB;
        }
        
        public int findRoot(int a) {
            while (a != pt[a]) {
                pt[a] = pt[pt[a]];
                a = pt[a];
            }
            return a;
        }
    }
}