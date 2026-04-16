package Binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question637 {
static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
        
    }
     public List<Double> averageOfLevels(TreeNode root) {
         List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
Double total =0.00;
Double ave =0.00;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                total += currentNode.val;

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }
            ave = total/levelSize;
            result.add(ave);
        }
        return result;
    }
    public static void main(String[] args) {
        Question637 q = new Question637();
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        List<Double> result = q.averageOfLevels(root);
        System.out.println(result);
    }
    }
