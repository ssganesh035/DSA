class Solution {
    public int maxScore(String s) {
        int len=s.length();
        int checkZero[]= new int[len];
        int checkOne[]= new int[len];
        int currZero=0;
        int currOne=0;
        for(int i=0,j=len-1;i<len && j>=0;i++,j--)
        {
            if(s.charAt(i)=='0')
            {
                checkZero[i]=currZero+1;
                currZero++;
            }
            else checkZero[i]=currZero;
            if(s.charAt(j)=='1')
            {
                checkOne[j]=currOne+1;
                currOne++;
            }
            else checkOne[j]=currOne;
        }
        int ans=0;
        for(int i=0;i<s.length()-1;i++)
        {
            ans= Math.max(ans,checkZero[i]+checkOne[i+1]);
        }
        return ans;
    }
}
