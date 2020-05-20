package bst;

import java.util.ArrayList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {};
     TreeNode(int val) {
         this.val = val;
         this.left =null;
         this.right =null;
     }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class KthSmallestElementINBST {
    public static TreeNode insert(TreeNode root, Integer data){
        if(root==null)
            root = new TreeNode(data);
        if(data<root.val)
            root.left = insert(root.left,data);
        else if(data> root.val)
            root.right = insert(root.right,data);
        return root;
    }
    //inorder traversal of the tree is the elements sorted in asc order in a array
    public static ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null)
            return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }

    public static int kthSmallestElement(TreeNode root,int k){
        ArrayList<Integer> list = new ArrayList<>();
        list = inorder(root,list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        TreeNode root  = null;
        int keys[] = {3,1,4,5,2};
        for(int key: keys)
            root = insert(root,key);
        System.out.println(root.val);
        System.out.println("kth smallest element is -" + kthSmallestElement(root,3));
    }
}
