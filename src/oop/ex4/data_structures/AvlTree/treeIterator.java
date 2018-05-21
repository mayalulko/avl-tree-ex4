package oop.ex4.data_structures.AvlTree;

public class treeIterator {
    private AvlNode nextNode;
    public treeIterator(AvlNode root){
        if(root!=null){
            nextNode=root;
            while(nextNode.getLeftSon()!=null){
                nextNode=nextNode.getLeftSon();
            }
        }

    }

}
