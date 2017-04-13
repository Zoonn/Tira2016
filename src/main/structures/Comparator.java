package main.structures;

/**
 * Created by Omppu on 24/01/2017.
 */

public class Comparator {

    boolean isLessThan(Object a,Object b){
        int aa = (int) ((Item) a).key();
        int bee = (int) ((Item) b).key();
        return aa < bee;
    }

    boolean isLessThanEqual(int a, int b){
        return a <= b;
    }

    boolean isEqualTo(Object a, Object b){
        int aa = (int) ((Item) a).key();
        int bee = (int) ((Item) b).key();
        return aa == bee;
    }

    boolean isGreaterThan(Object a, Object b){
        int aa = (int) ((Item) a).key();
        int bee = (int) ((Item) b).key();
        return aa > bee;
    }

    boolean isGreaterThanOrEqual(Object a, Object b){
        int aa = (int) ((Item) a).key();
        int bee = (int) ((Item) b).key();
        return aa >= bee;
    }

    boolean isComparable(Object a){
        if(a instanceof Item){
            return true;
        }
        else
            return false;

    }
}
