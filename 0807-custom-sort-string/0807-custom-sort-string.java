class Solution {
    public String customSortString(String order, String s) {
        int n = s.length();
        Character[] res = new Character[n];
        for (int i = 0; i < n; i++){
            res[i] = s.charAt(i);
        }
        // Above was done for array editing

        // Custom comparator
        Arrays.sort(res,(c1,c2) -> {
            return order.indexOf(c1) - order.indexOf(c2);
            // The index of the character in order determines the value to be sorted
        });

        //for returning result
        String resString = "";
        for (Character c :res){
            resString += c;
        }
        return resString;

        // TC (O(n log n))
        // SC (O(N))

    }
}

