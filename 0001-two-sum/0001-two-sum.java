class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int[] temp=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                temp[0]=map.get(rem);
                temp[1]=i; 
                break;
            }
            map.put(nums[i],i);
        }
        return temp;       
    }
}