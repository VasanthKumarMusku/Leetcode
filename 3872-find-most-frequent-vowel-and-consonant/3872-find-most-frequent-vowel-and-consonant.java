class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        int max1=0;
        int max2=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {

                map1.put(c,map1.getOrDefault(c,0)+1);
                max1=Math.max(max1,map1.get(c));
            }
            else 
            {

                map2.put(c,map2.getOrDefault(c,0)+1);
                max2=Math.max(max2,map2.get(c));
                
            }
        }
        return max1+max2;
    }
}