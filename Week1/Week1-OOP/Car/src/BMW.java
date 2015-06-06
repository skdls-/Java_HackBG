
public class BMW extends Car {
    
    private String verification = "I am a BMW car";

    
    BMW(String model)
    {
        this.setModel(model);
    }
    
    public void verify()
    {
        System.out.println(verification);
        System.out.println("My model is: ");
        System.out.println(this.getModel());
    }

}
