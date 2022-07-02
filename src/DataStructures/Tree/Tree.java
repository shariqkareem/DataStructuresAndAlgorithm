package DataStructures.Tree;

public class Tree {
    private TreeNode node;

    public void insert(int value){
        if(node == null)
            node = new TreeNode(value);
        else
            node.addChildNode(value);
    }

    public void traverseInOrder(){
        if(node == null)
            return;
        else
            node.traverseInOrder();
    }
}
