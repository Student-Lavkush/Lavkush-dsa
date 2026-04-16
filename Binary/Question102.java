package Binary;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



// Question no. 102 in leetcode
//                         BFS
public class Question102 {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
            //TODO Auto-generated constructor stub
        }
    }

    public static void main(String[] args) {
        Question102 q = new Question102();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = q.Zigzagorder(root);
        System.out.println(result);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            Double total = 0.00;
            Double ave = 0.00;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                total += currentNode.val;

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            ave = total / levelSize;
            result.add(ave);
        }
        return result;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> current = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                current.add(currentNode.val);

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            result.add(current);
        }
        return result;
    }

    public int findsuccessor(TreeNode root, int key) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode currentNode = queue.poll();

            if (currentNode.left != null)
                queue.offer(currentNode.left);
            if (currentNode.right != null)
                queue.offer(currentNode.right);

            if (currentNode.val == key) {
                break;
            }
        }
        TreeNode p = queue.peek();
        return p.val;

    }

    public List<List<Integer>> Zigzagorder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        boolean status = false;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> list1 = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                if (!status) {
                    TreeNode currentNode = queue.pollFirst();
                    list1.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }

                }
                if (status) {
                    TreeNode currentNode = queue.pollLast();
                    list1.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }

                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }

                }
            }
            status = !status;
            list.add(list1);

        }
        return list;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentNode= new TreeNode();
            int level = queue.size();
            for(int i =0;i<level;i++){
                 currentNode = queue.poll();
                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            list.add(currentNode.val);
        }
        return list;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findnode(root,x);
        TreeNode yy = findnode(root,y);
        return (level(root,xx,0)==level(root,yy,0)&&(!isCousins(root, x, y)));
    }
    public TreeNode findnode(TreeNode node,int value){
        if(node==null){
            return node;
        }
        if(node.val==value){
            return node;
        }
        TreeNode x =findnode(node.left, value);
        if(x!=null){
            return x;
        }
        return findnode(node.right, value);
    }
    int level(TreeNode node,TreeNode value,int lev){
        if(node==null){
            return 0;
        }
        if(node==value){
            return lev;
        }
        int n = level(node.left, value, lev+1);
        if(n!=0){
            return n;
        }
        return level(node.right, value, lev+1);
    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right= queue.poll();
            if(left==null&&right==null){
                continue;
            }
            if(left==null||right==null){
                return false;
            }
            if(left.val!=right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
     public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right= invertTree(root.right);
        root.left = right;
        root.right= left;
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return find(nums,0,nums.length-1);
      }
      public TreeNode find(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = find(nums, start, mid-1);
        root.right = find(nums,mid+1, end);
        return root;
        
      } 
}
