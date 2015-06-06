class Element{ 
    int key; 
    Element next; 
}


public class StackImpl { 
    
    Element top; 

    public void push(int x){ 
        Element elem=new Element(); 
        elem.key=x; elem.next=top; 
        top=elem; 
   } 

    public void pop(){ 
        if(empty()){ } 
        else{ top=top.next; }
    }
    
    public int top(){ 
        return top.key; 
    } 
        
    public boolean empty(){ 
        return top==null; 
    } 

    public static void main(String[] args) {
        StackImpl s=new StackImpl(); 
        s.push(2); 
        s.push(3); 
        while(!s.empty()){ 
            System.out.println(s.top()); 
            s.pop(); 
        } 
    }     
}

