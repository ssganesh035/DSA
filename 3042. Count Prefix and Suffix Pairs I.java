class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++) {
            for(int j=i+1;j<words.length;j++) {
                int x= words[i].length();
                int y= words[j].length();
                if(x<=y && words[i].equals(words[j].substring(0,x)) && words[i].equals(words[j].substring(y-x))) {
                    count++;
                }
            }
        }
        return count;
    }
}
