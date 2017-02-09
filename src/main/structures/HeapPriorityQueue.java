package main.structures;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;

public class HeapPriorityQueue implements PriorityQueue {

    private int size;      // elementtien m‰‰r‰ keossa
    BinaryTree T;
    Position last;
    Comparator comparator;

    public HeapPriorityQueue(){
        size = 0;
    }

    private void Heap(){
        for(int i = size / 2; i>0;i--){
            percolateDown(i);
        }
    }

    private boolean isLeftChild(Position p) throws InvalidParameterException{
        try{
            return T.leftChild(T.parent(p)).equals(p);
        }
        catch(Exception e){
            return false;

        }
    }

    private void percolateDown(int h ) {

    }

    /**
     * Prioriteettijonoon lis‰‰minen, jolla yll‰pidet‰‰n bin‰‰ripuun oikea j‰rjestys
     *
     * @param a
     * @param b
     */
    @Override
    public void insertItem(int a, Comparable b)throws InvalidKeyException {
        if (!comparator.isComparable(a)) {
            throw new InvalidKeyException("Invalid Key!");
        }
        Position z;
        if (isEmpty())
            z = T.root();
        else {
            z = last;

            while (!T.isRoot(z) && !isLeftChild(z)) {
                z = T.parent(z);
            }
            if (!T.isRoot(z))
                z = T.rightChild(z);
            while (!T.isExternal(z))
                z = T.leftChild(z);
        }

        T.expandExternal(z);
        T.replace(z, new Item(a,b));
        last = z;
        Position u = null;

        while(!T.isRoot(z)) {
            u = T.parent(z);
            if(!comparator.isLessThanEqual(u.getValue(),z.getValue())) break;
            T.swap(u,z);
            z = u;
        }

    }

    private Object keyOfPosition(Position p) throws Exception{
        return ((Item) p.element()).key();
    }

    /**
     * Pienimm‰n alkion etsint‰ prioriteettijonosta.
     */
    @Override
    public Comparable minElement() {
        return null;
    }

    /**
     * Pienimm‰n avaimen etsint‰ prioriteettijonosta.
     */
    @Override
    public Comparable minKey() {
        return null;
    }

    /**
     * Poista pienin alkio priotriteettijonosta
     */
    @Override
    public Comparable deleteMin() {
        return null;
    }

    /**
     * Testi, katsotaan, jonko jono tyhj‰
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Koon tutkiminen
     */
    @Override
    public int size() {
        return 0;
    }
}
