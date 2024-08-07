class Solution {
    public String numberToWords(int num) {
        if (num == 0) return "Zero" ;

        String[] ones = {"","One" , "Two","Three", "Four" , "Five", "Six", "Seven","Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen","Fourteen", "Fifteen", "Sixteen","Seventeen","Eighteen", "Nineteen"};
        String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty", "Seventy", "Eighty"
        ,"Ninety"};

        String[] thousands = {"", "Thousand", "Million","Billion"};

        StringBuilder res = new StringBuilder();
        int groupIndex = 0;

        while(num > 0){
            if(num % 1000 !=0){
                StringBuilder groupres = new StringBuilder();
                int part = num % 1000;

                if (part >= 100){
                    groupres.append(ones[part/100]).append(" Hundred ");
                    part %= 100;
                }

                if (part >= 20){
                    groupres.append(tens[part/10]).append(" ");
                    part %= 10;
                }

                if (part > 0){
                    groupres.append(ones[part]).append(" ");
                }
                groupres.append(thousands[groupIndex]).append(" ");
                res.insert(0, groupres);
            }
            num /= 1000;
            groupIndex++;
        }
        return res.toString().trim();
    }
}