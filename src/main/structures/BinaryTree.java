package main.structures;

import java.util.Enumeration;

/**
 * Created by Omppu on 30/01/2017.
 */
public class BinaryTree implements SimpleBinaryTree {

    Position root;
    int rootIndex = 1;
    int lastIndex = 1;

    public BinaryTree(){
        root = new Position();
    }


    @Override
    public Position leftChild(Position v) {
        return v.left;
    }

    @Override
    public Position rightChild(Position v) {

        return v.right;
    }

    @Override
    public Position sibling(Position v) {
        if(root == null)
            return null;

        return null;
    }

    public void expandExternal(Position v) {
        if(!isInternal(v)){
                Position r = new Position();
                Position l = new Position();
                v.left = l;
                v.right = r;
        }


    }

    @Override
    public Object removeAboveExternal(Position v) {
        return null;
    }

    @Override
    public Object replace(Object z, Object n) {
        Position p = (Position)z;
        Item temp;
        temp = p.getElement();
        p.setElement((Item)n);
        return temp;
    }

    @Override
    public Position root() {
        return this.root;
    }

    @Override
    public Position parent(Position v) {
        return v.parent;
    }






    @Override
    public Enumeration children(Position v) {
        return null;
    }

    @Override
    public boolean isInternal(Position v ) {
        return ((v.left != null) || (v.right != null));

    }

    @Override
    public boolean isExternal(Position v) {
        return !isInternal(v);
    }

    @Override
    public boolean isRoot(Position v) {

        return root == v;
    }

    @Override
    public int size(){
        return size(root);

    }
    private int size(Position v){
        if(v == null) return 0;
        else{
            return(size(v.left) + 1 + size(v.right));
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public Enumeration elements() {
        return null;
    }

    public void swap(Position v, Position e){
        if(v != null && e != null) {
            Item temp;
            temp = v.getElement();
            v.keyPair = e.getElement();
            e.keyPair = temp;

        }
    }
}
