package main.structures;

import java.util.Enumeration;

/**
 * Created by Omppu on 19/01/2017.
 */
public interface PositionalContainer {
    // query methods
    int size(); // return the size of the container
    boolean isEmpty(); // return whether the container is
    // empty or not
    Enumeration elements(); // return the elements in the container

}

