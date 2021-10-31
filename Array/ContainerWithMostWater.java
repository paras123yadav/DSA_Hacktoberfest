class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end){
            int temp=end-start;
            temp*=Math.min(height[start],height[end]);
            max=Math.max(temp,max);
            if(height[start]>height[end])
                end--;
            else
                start++;
        }
        return max;
    }
}
