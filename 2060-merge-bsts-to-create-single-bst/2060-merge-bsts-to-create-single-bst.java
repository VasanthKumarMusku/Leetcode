/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode canMerge(List<TreeNode> trees) {
        if(trees.size()==1) return trees.get(0);
        HashMap<Integer,TreeNode> map=new HashMap<>();
        for(TreeNode node:trees)
        {
            map.put(node.val,node);
        }
        HashSet<Integer> set=new HashSet<>();
        for(TreeNode node:trees)
        {
            if(node.left!=null) set.add(node.left.val);
            if(node.right!=null) set.add(node.right.val);
        }
        TreeNode parent=null;
        for(TreeNode root:trees)
        {
            if(!set.contains(root.val))
            {
                if(parent!=null) return null;
                parent=root;
            }
        }

        helper(parent,map);

        if(map.size()!=1) return null;
        ArrayList<Integer> list=new ArrayList<>();
        validate(parent,list);

        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=list.get(i-1)) return null;
        }
        return parent;

    }
    public TreeNode helper(TreeNode root,HashMap<Integer,TreeNode> map)
    {
        if(root==null) return null;

        if(root.left!=null && map.containsKey(root.left.val))
        {
            root.left=map.get(root.left.val);
            map.remove(root.left.val);
            helper(root.left,map);
        }

        if(root.right!=null && map.containsKey(root.right.val))
        {
            root.right=map.get(root.right.val);
            map.remove(root.right.val);
            helper(root.right,map);
        }
        return root;
    }
    public void validate(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null) return ;

        validate(root.left,list);
        list.add(root.val);
        validate(root.right,list);
    }

}