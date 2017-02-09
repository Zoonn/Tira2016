package main.structures;

import java.util.Enumeration;

/**
 * Created by Omppu on 19/01/2017.
 */
public interface SimpleTree extends PositionalContainer {
    // accessor methods
    Position root(); // return the root of the tree
    Position parent(Position v); // return the parent of v
    Enumeration children(Position v); // return the children of v
    // query methods
    boolean isInternal(Position v); // test whether v is internal
    boolean isExternal(Position v); // test whether v is
    // external
    boolean isRoot(Position v); // test whether v is the root of the tree

}




