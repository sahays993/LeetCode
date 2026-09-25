class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0,end=0;
        double sum=0,maxSum=Integer.MIN_VALUE;
        while(end<=nums.length-1){
            sum+=nums[end];
            if(end-start+1==k){
                maxSum=Math.max(sum,maxSum);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return maxSum/k;
    }
}