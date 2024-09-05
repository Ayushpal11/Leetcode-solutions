class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        // int sum = 0;
        // for(int roll: rolls){
        //     sum += roll;
        // }
        // int remaining =  
        // int[] res = new int[n];
        // for (int i  0; i< rolls.length; i++){

        // }
        int i,m=rolls.length,sum=0;
    	for(i=0;i<m;i++)
    		sum+=rolls[i];
			
    	int x=(mean*(m+n))-sum;
		
		if(x<=0||n*6<x||((x/n)==0)) {
    		return new int[] {};
		}
			
    	int arr[]=new int[n];
        int k=0;
    	while(n>0){
            int dice= Math.min(x-n+1, 6);
            arr[k]=dice;
            x=x-dice;
            n--;
            k++;

        }
    	return arr;
    }
}