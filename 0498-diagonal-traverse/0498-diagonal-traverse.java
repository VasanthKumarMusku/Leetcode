class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int flag=0; 
        for(int i=0;i<m;i++)
        {
            int j=0;
            int k=i;
            ArrayList<Integer> temp=new ArrayList<>();
            while(j<n && k>=0)
            {
                temp.add(mat[j][k]);
                j++;k--;
            } 
            if(flag==0)
            {
                Collections.reverse(temp);
                list.add(new ArrayList<>((temp)));
                flag=1;
            }
            else
            {
                list.add(new ArrayList<>(temp));
                flag=0;
            }

        }
        for(int i=1;i<n;i++)
        {
            int a=i;
            int b=m-1;
            ArrayList<Integer> temp=new ArrayList<>();
            while(a<n && b>=0)
            {
                temp.add(mat[a][b]);
                a++;
                b--;
            }
            if(flag==0)
            {
                Collections.reverse(temp);
                list.add(new ArrayList<>((temp)));
                flag=1;
            }
            else 
            {
                list.add(new ArrayList<>(temp));
                flag=0;
            }
        }
        System.out.println(list);
        int ind=0;
        int ans[]=new int[n*m];
        for(ArrayList<Integer> l:list)
        {
            for(int i:l)
            {
                ans[ind++]=i;
            }
        }
        return ans;
    }
}