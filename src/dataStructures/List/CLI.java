/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *

 */
public class CLI {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    
    LinkedList linkedList = new LinkedList();
    ArrayList arrayList = new ArrayList();
    
    public void start() throws IOException{   
        
        int T= Integer.parseInt(br.readLine()); 
        
        for (int i = 0; i < T; i++) {
            
            System.out.printf("Caso #%d:\n", i+1);
            
            this.testcase();            
        }
        
    }
    
    
    public void testcase() throws IOException{

        int N= Integer.parseInt(br.readLine()); 
        
        for (int i = 0; i < N; i++) {
            
            String rawCommand= br.readLine();
            
            String[] command= rawCommand.split(" ");
            
            processCommand(command);
            
        }        
        
    }
    
    public void processCommand(String[] command){
        
        int x;
        int pos;        
        
        switch(command[0]){
            
            case "insertar":
                
                x= Integer.parseInt(command[1]);
                pos= Integer.parseInt(command[2]);
                
                insertar(x, pos);
                
                break;
            case "consultar":
                
                pos= Integer.parseInt(command[1]);
                
                consultar(pos);
                
                break;
            case "eliminar":
                
                pos= Integer.parseInt(command[1]);
                
                eliminar(pos);
                
                break;
            case "buscar":
                
                x= Integer.parseInt(command[1]);
                
                buscar(x);
                
                break;
            case "costo":
                costo();
                break;
            default:
                //
                break;
            
        }
        
        System.out.println("");
        
    }
    
    
    void insertar(int x, int pos){
        
        System.out.print("insertar: ");
        
        try {
            linkedList.add(pos, x);       
            arrayList.add(pos, x);       
            System.out.print("posicion valida");
        } catch (IndexOutOfBoundsException e) {
            System.out.print("posicion invalida");            
        }
        
        
        
    }
    
    void consultar(int pos){
        
        System.out.print("consulta: ");
        try {
            int x=linkedList.get(pos);       
            arrayList.get(pos);       
            System.out.print(x);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("no encontrado");            
        }
        
    }
    
    void eliminar(int pos){
        
        System.out.print("eliminar: ");                
        try {
            linkedList.remove(pos);       
            arrayList.remove(pos);       
            System.out.print("posicion valida");
        } catch (IndexOutOfBoundsException e) {
            System.out.print("posicion invalida");            
        }
        
    }
    
    void buscar(int x){
        
        
        int pos= linkedList.indexOf(x);       
        arrayList.indexOf(x);  
        if(pos<0){
            System.out.print("no existe numero");
            return;
        }
            
        System.out.print("buscar: "+pos);
        
        
    }
    
    void costo(){        
        System.out.printf("costo: %d %d",arrayList.getCosto(),linkedList.getCosto());
    }
    
}
 
