package oop.ex4.data_structures.AvlTree;

import java.util.Iterator;

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
        while(next!=null){
            if(next.data>newValue){
                if(next.getRightSon()==null){
                    break;
                }
                next=next.getRightSon();
            }
            else if(next.data<newValue){
                if(next.getLeftSon()==null){
                    break;
                }
                next=next.getLeftSon();
            }
            else if(next.data==newValue){
                break;
            }
        }
        return next;

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
}
