public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car car1 = new Car();
        car1.setBrand("BMW");
        
        Audi audi1 = new Audi();
        
        audi1.setColor("Black");
        audi1.verify();
        
        BMW bmw1 = new BMW("X5");
        bmw1.verify();
        
        
    }

}
