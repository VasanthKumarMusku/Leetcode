class Solution {
    public int[] productQueries(int n, int[][] queries) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<32;i++)
        {
            if((n&(1<<i))!=0)
            {
                list.add((int)Math.pow(2,i));
            }

        }
        
        
        // long prefix[]=new long[list.size()];
        // prefix[0]=list.get(0);
        int m=(int)1e9+7;
        // for(int i=1;i<list.size();i++)
        // {
        //     prefix[i]=(prefix[i-1]%m*list.get(i)%m)%m;
        // }
        int ans[]=new int[queries.length];
        int i=0;
        for(int a[]:queries)
        {
            int l=a[0];
            int r=a[1];
            long product=1;
            for(int j=l;j<=r;j++){
               product=(product* list.get(j))%m;
            }
            ans[i]=(int)product;
            i++;
        }
        return ans;
    }
}