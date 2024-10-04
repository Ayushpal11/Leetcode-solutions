class Solution {
    public long dividePlayers(int[] skill) {
        // int tot = 0;
        // int n = skill.length;
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for (int s: skill){
        //     tot += s;
        //     mpp.put(s, mpp.getOrDefault(0,1) + 1);
        // }

        // if (tot % (n/2) != 0){
        //     return -1;
        // }
        // int target = tot / (n/2);
        // long totres = 0;

        // for (int curr: mpp.keySet()){
        //     int freq = mpp.get(curr);
        //     int partner = target - freq;
        //     if (!mpp.containsKey(partner) || freq != mpp.get(partner)){
        //         return -1;
        //     }
        //     totres += (long) curr * (long) partner * (long) freq;
        // }

        // return totres/2;

        long res = 0;
        Arrays.sort(skill);
        int n = skill.length;
        int sum = skill[0] + skill[n-1];

        for (int i=0; i<n/2; i++){
            if (sum != skill[i] + skill[n-i-1]){
                return -1;
            }
            res += (skill[i] * skill[n-i-1]);
        }
        return res;
    }
}