package DataStructures.Tree;

public class TreeNode {
    private int value;
    private int counter;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value) {
        this.value = value;
        counter = 1;
    }

    public void addChildNode(int childValue) {
        if(childValue == value){
            counter++;
        } else if(childValue < value){
            if(leftChild == null){
                leftChild = new TreeNode(childValue);
            } else {
                leftChild.addChildNode(childValue);
            }
        } else {
            if(rightChild == null){
                rightChild = new TreeNode(childValue);
            } else {
                rightChild.addChildNode(childValue);
            }
        }
    }

    public void traverseInOrder(){
        System.out.println(value);

        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }
}
