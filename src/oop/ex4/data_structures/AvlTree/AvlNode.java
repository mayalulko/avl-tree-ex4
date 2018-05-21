package oop.ex4.data_structures.AvlTree;

public class AvlNode {

    public int data;
    public AvlNode rightSon;
    public AvlNode leftSon;
    public AvlNode parent = null;
    private int height=0;
    protected Boolean flag=true;

    public AvlNode(int data){
    	this.data = data;
    	this.leftSon = null;
    	this.rightSon = null;
    }

	public AvlNode(int data, AvlNode parent){
		this.data = data;
		this.leftSon = null;
		this.rightSon = null;
		setParent(parent);
	}

	public void setParent(AvlNode parent){
    	this.parent = parent
	}

    public AvlNode getParent(){
    	return parent;
    }

    public void setRightSon(AvlNode son){
    	this.rightSon = son;
    	son.setParent(this);
	}

	public void setLeftSon(AvlNode son){
    	this.leftSon = son;
    	son.setParent(this);
	}

    public AvlNode getRightSon(){
    	return rightSon;
    }

    public AvlNode getLeftSon(){
    	return leftSon;
    }

    public int getHeight(){
    	return height;
    }

    public void setHeight(){
    	height = parent.height+1;
    }

}
