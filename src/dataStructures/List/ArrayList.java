/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.List;

import java.util.List;
import java.util.ListIterator;


public class ArrayList{
    
    private int size = 0;
    private int costo = 0;
    private int elements[];
    
    
    public int getCosto() {
        return costo;
    }

    public ArrayList() {
        costo=0;
        size=0;
        elements =new int[10];
    }
    

    
    public int size() {
        return size;
    }

    
    public boolean isEmpty() {
        return size==0;
    }    
   
    
    public int get(int pos) {
        
        if(pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();    
        
        return elements[pos];
    
    }   
   
    
    public void add(int pos, int x) {
        
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
        
        int[] temp= new int[elements.length*2];
        
        for (int i = 0; i < elements.length; i++) {            
            temp[i]=elements[i];            
        }
        
        elements=temp;
    }
    

    
    public int remove(int pos) {
        
        if(pos < 0 || pos >= size())
              throw new IndexOutOfBoundsException();
        
        int temp= elements[pos];

        if(pos!=size()-1){          
            for (int i = pos; i < size()-1 ; i++) {            
                elements[i]=elements[i+1];
                costo++;     
            }             
        }
      
        size--;
        
        return temp;
    
    }

    
    public int indexOf(int o) {
        
      
        int temp;
        for (int i = 0; i < size; i++) {
            
             temp=elements[i];
            
            costo++;
            
            if((temp==o))
                return i;
        }
        
        return -1;
    
    }

    
 
    
}
