class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        for(int i=0;i<len;i++)
        {
            boolean prev=(i==0 || flowerbed[i-1]==0);
            boolean next=(i==len-1 || flowerbed[i+1]==0);
            if(prev && next && flowerbed[i]==0)
            {
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}