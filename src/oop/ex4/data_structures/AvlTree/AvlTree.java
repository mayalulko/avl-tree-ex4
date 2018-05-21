package oop.ex4.data_structures.AvlTree;

import java.util.Iterator;
import AvlNode;

public class AvlTree implements Iterable {


    public AvlNode root;
    public AvlTree(){
        root=null;
    }
    public AvlTree(AvlTree tree){

    }
    public AvlTree(int[] data){

    }
    private AvlNode search(int newValue){
        AvlNode next = root;
        while (next != null){
            if (next.data > newValue){
                if (next.getRightSon() == null){
                    break;
                }
                next = next.getRightSon();
            }
            else if (next.data < newValue){
                if (next.getLeftSon()==null){
                    break;
                }
                next = next.getLeftSon();
            }
            else if (next.data == newValue){
                break;
            }
        }
        return next;
    }

    private static void rotateLeft(AvlNode node){
//    	AvlNode parent = node.getParent();
//    	AvlNode rightSon = node.getRightSon();
//    	parent.setLeftSon(rightSon);
//    	if (rightSon.getLeftSon() != null){
//    		node.setRightSon(rightSon.getLeftSon())
//		}
//		parent.getLeftSon().setLeftSon(node);
		AvlNode rightSon = node.getRightSon();
		if (rightSon.getLeftSon() != null){
			node.setRightSon(rightSon.getLeftSon());
		}
		rightSon.setLeftChild(node);
	}

    public void add(int newValue){
        AvlNode next=search(newValue);
        if(next.data>newValue){
            AvlNode son = new AvlNode(newValue);
            son.father = next;
            next.leftSon=son;
        }
        else if(next.data<newValue){
            AvlNode son = new AvlNode(newValue);
            son.father = next;
            next.leftSon=son;
        }
    }
    public Boolean contains(int newValue){
        AvlNode next = search(newValue);
        if(next.data==newValue){
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main()(string[] args){
    	AvlNode node = new AvlNode(2);
    	AvlNode rightSon = new AvlNode(3);
    	node.setRightSon(rightSon);
    	rightSon.setRightSon(new AvlNode(4));
    	AvlTree a = new AvlTree(node);
    	rotateLeft(node);
    	System.out.println(node.data);
    	System.out.println(node.getLeftChild().data);
    	System.out.println(node.getRightChild().data);
	}
}