package bst;

import java.util.ArrayList;

class TreeNode1
{
    int value;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int value){ this.value = value ; }
    TreeNode1(int value, TreeNode1 left, TreeNode1 right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class FindClosetValueToTargetInBST {

    private static TreeNode1 insert(TreeNode1 root, int key){
        if(root==null)
            return new TreeNode1(key);
        if(key<root.value)
            root.left = insert(root.left,key);
        else if(key>root.value)
            root.right = insert(root.right,key);
        return root;
    }

    private static int findNearestElement(TreeNode1 root, int target, int closest){
        if(root==null)
            return closest;
        if(Math.abs(root.value-target) <= Math.abs(closest-target))
            closest = root.value;
        else if(target<root.value)
            return findNearestElement(root.left,target,closest);
        else if(target>root.value)
            return findNearestElement(root.right,target,closest);
        return closest;
    }

    private static ArrayList<Integer> inorder(TreeNode1 root, ArrayList<Integer> list){
        if(root==null)
            return list;
        inorder(root.left,list);
        list.add(root.value);
        inorder(root.right,list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode1 root =null;
        int keys[] = {12,5,23,2,11,19,30,1,4,8,13,20};
        for(int key: keys)
            root = insert(root,key);

        ArrayList<Integer> list = inorder(root,new ArrayList<>());
        list.stream().forEach(key -> System.out.print(key + ","));
        int target =14;
        System.out.println("Nearest element to " + target + " is-" + findNearestElement(root,target,-999));
    }
}
