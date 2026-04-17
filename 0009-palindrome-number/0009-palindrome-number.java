class Solution {
    public boolean isPalindrome(int x) {
        // int n=-121;
        // int val=0;
        // while(n!=0){
        //    int r=n%10;
        //     val=(val*10)+r;
        //     n=n/10;
        //     System.out.println(r);
        // }
        // System.out.println(val);
        // return true;
        String s =Integer.toString(x);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;

            }
            l++;
            r--;
        }
        return true;
    }
}