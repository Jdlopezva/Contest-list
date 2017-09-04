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
public class ArrayList<T> implements List<T> {
    
    private int size = 0;
    private int costo = 0;
    private T elements[];
    
    
    public int getCosto() {
        return costo;
    }

    public ArrayList() {
        costo=0;
        size=0;
        elements =(T[]) new Object[10];
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
    public boolean add(T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T get(int pos) {
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();    
        
        return elements[pos];
    
    }

    @Override
    public T set(int i, T e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int pos, T x) {
        
        if(pos < 0 || pos > size())
              throw new IndexOutOfBoundsException();

        if(elements.length==size())duplicarArreglo();

        if(pos==size()){
            elements[pos]=x;
            size++;
            return;
        }
      
        for (int i = size(); i > pos; i--) {            
            elements[i]=elements[i-1];
            costo++;     
        }      
        
        elements[pos]=x;
        size++;
        
    }
    
    void duplicarArreglo(){
        
        T[] temp= (T[])new Object[elements.length*2];
        
        for (int i = 0; i < elements.length; i++) {            
            temp[i]=elements[i];            
        }
        
        elements=temp;
    }
    

    @Override
    public T remove(int pos) {
        
        if(pos < 0 || pos >= size())
              throw new IndexOutOfBoundsException();
        
        T temp= elements[pos];

        if(pos!=size()-1){          
            for (int i = pos; i < size()-1 ; i++) {            
                elements[i]=elements[i+1];
                costo++;     
            }             
        }
      
        size--;
        
        return temp;
    
    }

    @Override
    public int indexOf(Object o) {
        
        T t = (T) o;
        
        for (int i = 0; i < size; i++) {
            
            T temp=elements[i];
            
            costo++;
            
            if((temp.equals(t)))
                return i;
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
