package main.structures;

/**
 * Created by Omppu on 19/01/2017.
 */

public class Item {
    private Object key, elem;
    protected Item ( Object k, Object e) {
        key = k;
        elem = e;
    }
    public Object key() { return key; }
    public Object element() { return elem; }
    public void setKey(Object k) { key = k; }
    public void setElement(Object e) { elem = e;}
}


