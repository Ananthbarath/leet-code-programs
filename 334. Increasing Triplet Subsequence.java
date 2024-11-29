class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n= nums.length;
        if(n<3){
            return false;
        }
        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=f){
                f=i;
            }
            else if(i<=s){
                s=i;
            }
            else{
                return true;
            }
        }
        return false;
    }
}