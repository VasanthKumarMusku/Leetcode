class Solution {
    public boolean check(String s,int mid,int k)
    {
        int hash[]=new int[26];
        for(int i=0;i<mid;i++){
            hash[s.charAt(i)-'a']++;
        }
        boolean flag=true;
        for(int i:hash)
        {
            if(i!=0 && i<k)
            {
                flag=false;
                break;
            }
        }
        if(flag) return true;
        int l=0;
        for(int i=mid;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;
            
                hash[s.charAt(i-mid)-'a']--;
            flag = true;
            for(int j=0;j<26;j++)
            {
                if(hash[j]!=0 && hash[j]<k)
                {
                    flag=false;
                    break;
                }
            }
            if(flag) return true;

        }
        return false;
        
    }
    public int longestSubstring(String s, int k) {
       
        int max=0;
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)-'a']++;

        }
        int c=0;
        for(int i:hash)
        {
            if(i!=0 && i<k)
            {
                c=1;
                break;

            }
        }
        if(c==0) return s.length();

           
        int low=k;
        int high=s.length();
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            // if(mid == 3) System.out.println(check(s, mid, k));
            if(check(s,mid,k))
            {
                ans=mid;
                low=mid+1;

            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}