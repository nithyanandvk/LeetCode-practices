/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // ArrayList<TreeNode> p1=new ArrayList<>();
        // ArrayList<TreeNode> p2=new ArrayList<>();
        // getPath(root,p,p1);
        // getPath(root,q,p2);
        // int i=0;
        // for(i=0;i<p1.size() && i<p2.size();i++){
        //     if(p1.get(i) !=p2.get(i)){
        //         break;
        //     }
        // }
        // return p1.get(i-1);

        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return root;
    }
    public static boolean getPath(TreeNode root,TreeNode n,ArrayList<TreeNode> p){
        if(root==null){
            return false;
        }
        p.add(root);
        if(root.val==n.val){
            return true;
        }
        boolean l=getPath(root.left,n,p);
        boolean r=getPath(root.right,n,p);
        if(l||r){
            return true;
        }
        p.remove(p.size()-1);
        return false;
    }
}