class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i:nums) max=Math.max(max,i);
        int l=0;
        int r=0;
        long ans=0;
        int n=nums.length;
        int count=0;

        while(r<n)
        {
            if(nums[r]==max) count++;
            
            while(count>=k)
            {
                if(count>=k) ans+=(n-r);
                if(nums[l]==max) count--;
                l++;
            }
            
            r++;
           
        }
        return ans;
    }
}