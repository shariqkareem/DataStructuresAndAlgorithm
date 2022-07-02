package DataStructures.Tree;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfNodes = sc.nextInt();
        //Tree tree = new Tree();
        Tree tree = new Tree();
        for(int i =0;i<numberOfNodes;i++){
            tree.insert(sc.nextInt());
        }

        tree.traverseInOrder();
    }
}
