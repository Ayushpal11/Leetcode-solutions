class Solution {
public:
    int findGCD(int a, int b){
        if(a == 0) return b;
        return findGCD(b % a, a);
    }

    string fractionAddition(string expression) {
        int n = expression.length();
        int index = 0;

        int totalNumer = 0;
        int totalDeno = 0;

        // totalNumer = currNumer * totalDeno + currDeno * totalNumo
        // totalDeno = currDeno * totalDeno

        while(index < n){
            int sign = 1;

            if(expression[index] == '+'){
                index++;
            } else if (expression[index] == '-') {
                index++;
                sign = -1;
            }

            int currNumer = 0;
            while (index < n && isdigit(expression[index])) {
                currNumer = currNumer * 10 + (expression[index++] - '0');
            }

            index++; // skip '/'

            int currDeno = 0;
            while (index < n && isdigit(expression[index])) {
                currDeno = currDeno * 10 + (expression[index++] - '0');
            }

            if(totalNumer == 0 && totalDeno == 0){
                totalNumer = sign * currNumer;
                totalDeno = currDeno;
            } else {
                totalNumer = sign * currNumer * totalDeno + currDeno * totalNumer;
                totalDeno = currDeno * totalDeno;
            }
        }
        
        int gcd = abs(findGCD(totalNumer, totalDeno));
        totalNumer /= gcd;
        totalDeno /= gcd;

        return to_string(totalNumer) + '/' + to_string(totalDeno);
    }
};