package main.structures;

/**
 * Created by Omppu on 19/01/2017.
 */
public class Position{

    public Position left;
    public Position right;
    public int data;

    public Position(int data)
    {
        this.data=data;
    }

    public void printNode()
    {
        System.out.println(data);
    }
    public Comparable getValue() {
        return data;
    }


}
