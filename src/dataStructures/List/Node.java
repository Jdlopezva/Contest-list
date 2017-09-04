/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.List;

/**
 *
 * @author emilbert
 */
public class Node<T> {
    
    private T item;    
    private Node<T> next;

    public Node(T item) {
        this.item = item;
        next=null;
    }    
    

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }        
    
    
}
