class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int Childrencnt = 0;
        int Index = 0;
        while(Index < s.length && Childrencnt < g.length){
            if (s[Index] >= g[Childrencnt]){
                Childrencnt++;
            }
            Index++;
        }
        return Childrencnt;
    }
}