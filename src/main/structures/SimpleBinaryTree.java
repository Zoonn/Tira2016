package main.structures;

/**
 * Created by Omppu on 19/01/2017.
 */
public interface SimpleBinaryTree extends SimpleTree {
    // Simplified interface for a binary tree whose nodes (positions)
    // store arbitrary elements.
    // Accessor methods:
    public Position leftChild(Position v);
    public Position rightChild(Position v);
    public Position sibling(Position v);


    // Update methods
    public void expandExternal(Position v);
    public Object removeAboveExternal(Position v);
    public Object replace(Object z,Object n);
}
