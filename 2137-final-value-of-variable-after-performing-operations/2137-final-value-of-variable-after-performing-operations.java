class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        String s="";
        String i1="++X";
        String i2="X++";
        for(int i=0;i<operations.length;i++)
        { 
            s=operations[i];
            if(s.equals(i1) || s.equals(i2))
                x++;
            else  x--;
        }
        return x;
    }
}