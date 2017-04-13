package main.structures;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;

public class HeapPriorityQueue {

    private int size = 0;      // elementtien määrä keossa
    public BinaryTree T = new BinaryTree();
    Position last = new Position();
    Comparator comparator = new Comparator();

    public HeapPriorityQueue() {
        size = 0;
    }


    private boolean isLeftChild(Position p) throws InvalidParameterException {
        try {
            return T.leftChild(T.parent(p)).equals(p);
        } catch (Exception e) {
            return false;

        }
    }

    /**
     * Prioriteettijonoon lisääminen, jolla ylläpidetään binääripuun oikea järjestys
     *
     * @param a
     * @param b
     */

    public void insertItem(int a, Object b) throws InvalidKeyException {
        Position z;

        if (isEmpty())
            z = T.root();
        else {
            z = last;

            while (!T.isRoot(z) && !isLeftChild(z)) {
                z = T.parent(z);
            }
            if (!T.isRoot(z))
                z = T.rightChild(T.parent(z));
                z.parent =last.parent;
            while (!T.isExternal(z))
                z = T.leftChild(z);
                z.parent =last;
        }

        Item gen = new Item(a, b);
        T.expandExternal(z);
        T.replace(z, gen);

        last = z;
        Position u;


        while (!T.isRoot(z)) {
            u = T.parent(z);
            if (comparator.isLessThanEqual(u.getElement().key(), z.getElement().key())) break;
            T.swap(u, z);
            z = u;


        }
        size++;
    }

    /**
     * Pienimmän alkion etsintä prioriteettijonosta.
     */

    public Item minElement() {
        Item min = T.root.getElement();
        return min;
    }


    /**
     * Pienimmän avaimen etsintä prioriteettijonosta.
     */

    public int minKey() {
        Item min = T.root.getElement();
        return min.key();
    }

    /**
     * Poista pienin alkio priotriteettijonosta
     */

    public Item deleteMin() {
        Item returnValue;

        if (isEmpty()) {
            return null;
        } else if (size() == 1) {
            returnValue = T.root.getElement();
            T.root = last = null;
            size--;
            return returnValue;
        } else {
            returnValue = T.root.getElement();
            Position left = T.root.getLeft();
            left.setLeft(null);
            T.root.setRight(null);
            T.root = left;
            size--;
            bubbleDown();
            return returnValue;

        }

    }


    /**
     * Testi, katsotaan, jonko jono tyhjä
     */

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Koon tutkiminen
     */

    public int size() {
        return size;
    }

    public void print() {
        printPreorder(T.root);
        System.out.println();
    }

    private void printPreorder(Position node) {
        System.out.println(node.getElement().key() + " ");
        if (node.getLeft() != null) {
            printPreorder(node.getRight());
        }
        if (node.getRight() != null) {
            printPreorder(node.getRight());
        }
    }

    public void bubbleDown() {
        Position p = T.root;

        while (p.left != null) {
            Position smallerChild = p.getLeft();
            if (p.right != null
                    && p.getLeft().keyPair.key() > p.getRight().keyPair.key()) {
                smallerChild = p.getRight();
            }

            if (p.keyPair.key() > smallerChild.keyPair.key()) {
                T.swap(p, smallerChild);
            } else {
                break;
            }

            p = smallerChild;
        }
    }
}