class Solution {
    public String getLetters(int digit)
    {
        String map[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return map[digit];

    }
    public List<String> mapping(String p,String up)
    {
        if(up.isEmpty())
        {
            List<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        String letters=getLetters(digit-2);
        List<String>ans=new ArrayList<>();
        for(int i=0;i<letters.length();i++)
        {
            char ch=letters.charAt(i);
            ans.addAll(mapping(p+ch,up.substring(1)));
        }
        return ans;
    }

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        return mapping("",digits);
    }
}