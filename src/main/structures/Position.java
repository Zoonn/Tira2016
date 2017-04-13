package main.structures;

public class Position{

    public Position left;
    public Position right;
    public Position parent;
    public Item keyPair;

    public void printKeyPair()
    {
        System.out.println(keyPair);
    }
    public Item getElement() {
        return keyPair;
    }
    public void setElement(Item a){
        this.keyPair = a;
    }


    public Position getLeft() {
        return left;
    }
    public Position getRight() {
        return right;
    }
    public void setRight(Position n) {
        right = n;
    }
    public void setLeft(Position p) {
        left = p;
    }

}
