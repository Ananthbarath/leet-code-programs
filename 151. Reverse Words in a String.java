class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+", " ");
        String[] str=s.split(" ");
		int l=0,r=str.length-1;
		while(l<r){
		    String t=str[l];
		    str[l]=str[r];
		    str[r]=t;
		    l++;
		    r--;
		}
		return String.join(" ",str);
    }
}
