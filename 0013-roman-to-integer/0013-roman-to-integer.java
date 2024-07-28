class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer > roman = new HashMap<Character , Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int res = 0;
        for (int i = 0; i<s.length(); i++){
            res += (roman.get(s.charAt(i)));
        }
        return res;

    }
}