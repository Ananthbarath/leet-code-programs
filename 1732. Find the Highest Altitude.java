class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int max_val=0;
        for (int i:gain){
            current+=i;
            max_val=Math.max(max_val,current);
        }
        return max_val;
        
    }
}
