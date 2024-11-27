class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] result=new int[l];

        Arrays.fill(result,1);
         int prefix = 1;
        for (int i = 0; i < l; i++) {
            result[i] = prefix; 
            prefix *= nums[i]; 
        }

       
        int suffix = 1;
        for (int i = l - 1; i >= 0; i--) {
            result[i] *= suffix; 
            suffix *= nums[i]; 
        }
        return result;
    }
}
