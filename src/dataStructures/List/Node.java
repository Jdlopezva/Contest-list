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
public class Node {
    
    private int item;    
    private Node next;

    public Node(int item) {
        this.item = item;
        next=null;
    }    
    

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }        
    
    
}
