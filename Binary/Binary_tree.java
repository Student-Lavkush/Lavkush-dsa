package Binary;

import java.util.Scanner;

public class Binary_tree {
    public Binary_tree() {

    }

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node root;

    // inserting the value
    public void populate(Scanner scanner) {
        System.out.println("Enter the value of root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of" + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value that you want to insert left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the right of" + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value that you want to insert right of " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void pretty_display(){
        pretty_display(root,0);
    }
private void pretty_display(Node node,int level){
    if(node ==null){
        return;
    }
    pretty_display(node.right,level+1);
    if(level!=0){
        for(int i=0;i<level-1;i++){
            System.out.print("|\t\t\t");
        }
        System.out.println("|--------->"+node.val);
    }
    else{
        System.out.println(node.val);
    }
    pretty_display(node.left,level+1);

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    Binary_tree tree = new Binary_tree();
    tree.populate(scanner);
    tree.pretty_display();;

}
}
