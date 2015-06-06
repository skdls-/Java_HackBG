
public class InvalidUserName extends RuntimeException {

    private String name;
    public InvalidUserName()
    {
       this.name.equals("");
    } 
    
    public String getName()
    {
       return name;
    }
    
}
