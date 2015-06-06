import java.util.LinkedList;

class User
{
    String name;
    
    User(String n)
    {
        this.name = n;
    }
    
    void setName(String n)
    {
        this.name = n;
    }
    
    String getName()
    {
        return this.name;
    }
}
public class UserTable {

    LinkedList<User> n  = new LinkedList<User>();
    
    void addUser(User u) throws InvalidUserName
    {
        if(u.getName() != "")
            n.add(u);
        
        else
        {
           throw new InvalidUserName();
        }
    }
    
    public static void main(String[] args)
    {
        UserTable UT = new UserTable();
        User Goshko = new User("Goshko");
        UT.addUser(Goshko);
        User Bad = new User("");
        UT.addUser(Bad);
        
    }
}
