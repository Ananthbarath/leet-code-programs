class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List result=new ArrayList<>();
        int maxCandy=0;
        for(int i=0;i<n;i++){
            maxCandy=Math.max(maxCandy,candies[i]);

        }
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=maxCandy){
                result.add(i,true);
            }else{
                result.add(i,false);
            }
            
        }
        return result;
    }
}
