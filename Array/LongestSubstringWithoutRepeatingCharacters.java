class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=start){
                count=i-map.get(s.charAt(i));
                start=map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i),i);
            }
            else{
                map.put(s.charAt(i),i);
                count++;
            }
            if(count>max)
                max=count;
        }
        return max;
    }
}
