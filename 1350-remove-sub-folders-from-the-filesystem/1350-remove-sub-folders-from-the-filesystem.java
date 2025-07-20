class Solution {
    public List<String> removeSubfolders(String[] folder) {
       Arrays.sort(folder);
       ArrayList<String>list=new ArrayList<>();
       list.add(folder[0]);
       int n=folder.length;
       if(n==1) return list;
       for(int i=1;i<n;i++)
       {
            String s=list.get(list.size()-1);
            int ind=folder[i].indexOf(s);
            if(ind != 0 || ((folder[i].length() > s.length() && folder[i].charAt(s.length()) != '/')))
            {
                list.add(folder[i]);
               
            }
            
            
       }
        return list;


    }
}