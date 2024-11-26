class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        String vowels="aeiouAEIOU";
        int l=0,r=arr.length-1;
        while(l<r){
            if(!vowels.contains(String.valueOf(arr[l])))
                l++;
            else if(!vowels.contains(String.valueOf(arr[r])))
                r--;
            else{
                char t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}
