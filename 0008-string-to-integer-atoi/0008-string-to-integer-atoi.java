class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        boolean sign=false;
        boolean pos=false;
        boolean digit=false;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='-' && !digit)
            {

                if(sign ) break;
                if(!digit && !pos)
                {
                    sign=true;
                }
                else break;
            }
            else if(ch=='+' && !digit)
            {
                if(pos ) break;
                if(!sign) pos=true;
                else break;
            }
            else if(ch-48>=0 && ch-48<=9)
            {
                digit=true;
                ans=(ans*10)+ch-48;
                if (ans > (long) Integer.MAX_VALUE) {
                    return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
            else
            {
                break;
            }


        }
        if(sign)
        {
            if(ans>Integer.MAX_VALUE) return Integer.MIN_VALUE;
            else return -(int)ans;
        }
        else
        {
            if(ans>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
            else return (int)ans;

        }
      
    }
}