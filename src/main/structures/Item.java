package main.structures;

/**
 * Created by Omppu on 19/01/2017.
 */

public class Item {
    private int key;
    Object elem;
    protected Item ( int k, Object e) {
        key = k;
        elem = e;
    }
    public int key() { return key; }
    public Object element() { return elem; }
    public void setKey(int k) { key = k; }
    public void setElement(Object e) { elem = e;}
}


