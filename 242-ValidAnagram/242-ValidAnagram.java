// Last updated: 2/4/2026, 8:20:53 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> hm=new HashMap();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        for(int x:hm.values()){
            if(x!=0) return false;
        }
        return true;
    }
}