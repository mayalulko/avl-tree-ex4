package oop.ex4.data_structures.AvlTree;

public class AvlNode {

    public int data;
    public AvlNode rightSon= null;
    public AvlNode leftSon = null;
    public AvlNode father = null;
    private int height=0;
    protected Boolean flag=true;
    public AvlNode(int data){
        this.data = data;
    }
    public AvlNode getFather(){return father;}
    public AvlNode getRightSon(){return rightSon;}
    public AvlNode getLeftSon(){return leftSon;}
    public int getHeight(){return height;}
    public void setHeight(){height=father.height+1;}

}
