package Laboratorio.L14.L14E01;
public class Contatore {
 	int a; 
    
    public Contatore(){ 
        a=0;
    }
    
    public Contatore(int aa){ 
        a=aa;
    } 
	
    void inc() { 
        a=a+1;
    } 
	
    void reset() {
        a=0;
    } 
} 