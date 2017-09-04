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
public class LinkedList<T> implements List<T>{
    
    int costo;

    public int getCosto() {
        return costo;
    }    
    
    int size;    
    Node<T> head;

    public LinkedList() {
        
        size=0;
        costo=0;
        head=null;
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(T t) {
        
        if(t==null) return false;
        
        add(size, t);        
        return true;
        
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        head=null;
        size=0;
    }

    @Override
    public T get(int pos) {
        
        return getNode(pos).getItem();
        
    }
    
    public Node<T> getNode(int pos){        
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        
        Node<T> temp= head;           
                
        for (int j = 0; j < pos; j++){
            temp=temp.getNext(); 
            costo++;            
        }
        
        return temp;
        
        
    }

    @Override
    public T set(int i, T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int pos, T item) {
        
        if(pos < 0 || pos > size())
            throw new IndexOutOfBoundsException();
        
        Node<T> newNode = new Node<T>(item);

        if(this.isEmpty()){
            head = newNode;  
            size++;
            return;
        }
        
        if(pos==0){
            
            newNode.setNext(head);
            head=newNode;
            
        }else{            
            Node<T> prev= getNode(pos-1);
            Node<T> next= prev.getNext();   
            costo++;
            prev.setNext(newNode);
            newNode.setNext(next);
        }  
        
        size++;
        
        
    }

    @Override
    public T remove(int pos) {
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        
        Node<T> temp;
        
        if(pos==0){
            temp=head;
            head=head.getNext();
        }else{
            
            Node<T> prev= getNode(pos-1);
            temp= prev.getNext();
            costo++;
            Node<T> next= temp.getNext();        
            costo++;
            prev.setNext(next);           
        }        
        
        size--;
        
        return temp.getItem();
    }

    @Override
    public int indexOf(Object o) {
        
        Node<T> temp= head;
        
        T t = (T) o;
        
        for (int i = 0; i < size; i++) {
            
            costo++;
            
            if((temp.getItem().equals(t)))
                return i;
            
            
            temp=temp.getNext();
        }
        
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> subList(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
