/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.List;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author emilbert
 */
public class LinkedList{
    
    int costo;

    public int getCosto() {
        return costo;
    }    
    
    int size;    
    Node head;

    public LinkedList() {
        
        size=0;
        costo=0;
        head=null;
        
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size==0;
    }
   


    public boolean add(int t) {
                
        add(size, t);        
        return true;
        
    }
    

    public void clear() {
        head=null;
        size=0;
    }

    
    public int get(int pos) {
        
        return getNode(pos).getItem();
        
    }
    
    public Node getNode(int pos){        
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        
        Node temp= head;           
                
        for (int j = 0; j < pos; j++){
            temp=temp.getNext(); 
            costo++;            
        }
        
        return temp;
        
        
    }

   

    public void add(int pos, int item) {
        
        if(pos < 0 || pos > size())
            throw new IndexOutOfBoundsException();
        
        Node newNode = new Node(item);

        if(this.isEmpty()){
            head = newNode;  
            size++;
            return;
        }
        
        if(pos==0){
            
            newNode.setNext(head);
            head=newNode;
            
        }else{            
            Node prev= getNode(pos-1);
            Node next= prev.getNext();   
            costo++;
            prev.setNext(newNode);
            newNode.setNext(next);
        }  
        
        size++;
        
        
    }

    public int remove(int pos) {
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        
        Node temp;
        
        if(pos==0){
            temp=head;
            head=head.getNext();
        }else{
            
            Node prev= getNode(pos-1);
            temp= prev.getNext();
            costo++;
            Node next= temp.getNext();        
            costo++;
            prev.setNext(next);           
        }        
        
        size--;
        
        return temp.getItem();
    }

    public int indexOf(int o) {
        
        Node temp= head;
        
        for (int i = 0; i < size; i++) {
            
            costo++;
            
            if((temp.getItem()==o))
                return i;
            
            
            temp=temp.getNext();
        }
        
        return -1;
    }

   
    

}
