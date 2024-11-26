class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";

        int a =str1.length();
        int b=str2.length();
        int gcd;
        if(a>b){
            gcd=GCD(a,b);
        }
        else{
            gcd=GCD(b,a);
        }
        return str1.substring(0,gcd);
    }
    public int GCD(int a, int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
