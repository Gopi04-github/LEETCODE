class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,ans=0;
        HashMap<Character,Integer> a=new HashMap<>();
        int n=s.length();
        while(r<n){
            if(a.containsKey(s.charAt(r))){
                l=Math.max(a.get(s.charAt(r))+1,l);
            }
            a.put(s.charAt(r),r);
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
