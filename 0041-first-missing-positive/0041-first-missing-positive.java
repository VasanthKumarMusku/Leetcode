class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        if(n==1)
        {
            if(arr[0]==1) return 2;
            else return 1;
        }
        
        for(int i=0;i<n;i++)
            {
                while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i])
                {
                    int temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(i+1!=arr[i])
                {
                    return i+1;
                }
            }
        
        return n+1;
    }
}