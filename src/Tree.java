public class Tree {

    int val;
    Tree left;
    Tree right;

    Tree(int val, Tree left, Tree right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    Tree(int val){
        this.val = val;
    }

    Tree(){
        super();
    }


    //Depth First Traversals
    public void inOrderTraversal(Tree root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Tree root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Tree root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }
    
    public static void main(String[] args) {
        //let's make a tree 
        //      1
        //    /   \ 
        //   2     3
        //  / \   / \
        // 4   5  6  7
        Tree tree = new Tree(1, 
                        new Tree(2, 
                            new Tree(4), new Tree(5)), 
                        new Tree(3, 
                            new Tree(6), new Tree(7)));
        //traversal is O(n) where n is nodes in the tree
        System.out.println("inorder: ");
        tree.inOrderTraversal(tree);
        System.out.println("preorder: ");
        tree.preOrderTraversal(tree);
        System.out.println("postorder: ");
        tree.postOrderTraversal(tree);
    }
}
