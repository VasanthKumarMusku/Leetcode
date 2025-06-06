class Solution {
    void  helper(char ch[],int i,int j)
    {
        int diff=j-i-1;
        if(diff==0) return;
        if(ch[i]=='R')
        {
            if(ch[j]=='R')
            {
                for(int x=1;x<=diff;x++)
                {
                    ch[x+i]='R';
                }
            }
            else
            {
                for(int x=1;x<=diff/2;x++)
                {
                    ch[x+i]='R';
                }

                for(int x=1+diff/2+diff%2;x<=diff;x++)
                {
                    ch[x+i]='L';
                }
            }
        }
        else
        {
            if(ch[j]=='L')
            {
                 for(int x=1;x<=diff;x++)
                {
                    ch[x+i]='L';
                }
            }
        }
    }
    public String pushDominoes(String doms) {
        int n=doms.length();
        char ch[]=doms.toCharArray();
        int i=0;
        while(i<n && ch[i]=='.') i++;
        if(i==n) return doms;
        int last=i;
        if(ch[i]=='L') for(int x=0;x<i;x++) ch[x]='L';
        for(int j=i+1;j<n;j++)
        {
            if(ch[j]!='.')
            {
                helper(ch,last,j);
                last=j;
            }
        }
        if(ch[last]=='R') for(int x=last+1;x<n;x++) ch[x]='R';
        return new String(ch);
    }
}