package main.structures;

import java.util.Enumeration;

/**
 * Created by Omppu on 30/01/2017.
 */
public class BinaryTree implements SimpleBinaryTree {

    protected Position root;
    int rootIndex = 1;
    int lastIndex = 1;

    public BinaryTree(){
        root = null;
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

    @Override
    public void expandExternal(Position v) {
        Position currentRoot = v;

    }

    @Override
    public Object removeAboveExternal(Position v) {
        return null;
    }

    @Override
    public void replace(Object z, Object n) {

    }

    @Override
    public Position root() {
        return this.root;
    }

    @Override
    public Position parent(Position v) {
        return parentHelper(root, v);
    }

    private Position parentHelper(Position currentRoot, Position v){
        if( v == currentRoot || isRoot(v))
            return null;
        else{
            if(currentRoot.left==v || currentRoot.right==v)
                return root;
            else{
                if(currentRoot.data < v.data){
                    return parent(currentRoot.right);
                }
                else{
                    return parent(currentRoot.left);
                }
            }
        }
    }

    @Override
    public Enumeration children(Position v) {
        return null;
    }

    @Override
    public boolean isInternal(Position v) {
        return false;
    }

    @Override
    public boolean isExternal(Position v) {
        return false;
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
            Position temp;
            temp = v;
            v = e;
            e = temp;

        }
    }
}
