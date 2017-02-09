package main.structures;

import java.security.InvalidKeyException;

/**
 * Prioriteettijono-rajapinta
 */

public interface PriorityQueue {
    /**
     * Prioriteettijonoon lis‰‰minen, jolla yll‰pidet‰‰n bin‰‰ripuun oikea j‰rjestys
     */
     void insertItem(int k,Comparable e)throws InvalidKeyException;

    /**
     * Pienimm‰n alkion etsint‰ prioriteettijonosta.
     */
    Comparable minElement();

    /**
     * Pienimm‰n avaimen etsint‰ prioriteettijonosta.
     */
    Comparable minKey();

    /**
     * Poista pienin alkio priotriteettijonosta
     */
    Comparable deleteMin() ;

    /**
     * Testi, katsotaan, jonko jono tyhj‰
     */
    boolean isEmpty();

    /**
     * Koon tutkiminen
     */
    int size();
}
