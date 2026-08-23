package Core;

interface IDeliveryService{
    Boolean DeliverProduct(double amount);
}

class FedEx implements IDeliveryService{
    public Boolean DeliverProduct(double amount){
        System.out.println("FedEx is delivering the product  " + amount);
        return true;
    }
}

class BlueDart implements IDeliveryService {
    public Boolean DeliverProduct(double amount) {
        System.out.println("BlueDart is delivering the product " + amount);
        return true;
    }
}

class FirstFlight implements IDeliveryService {
    public Boolean DeliverProduct(double amount) {
        System.out.println("FirstFlight is delivering the product " + amount);
        return true;
    }
}ques

class Amazon {
    private IDeliveryService deliveryService;
    public void setService(IDeliveryService deliveryService){
        System.out.println("Setting the delivery service");
        this.deliveryService = deliveryService;
    }
    public Boolean DeliverTheProduct(double amount) {
        return deliveryService.DeliverProduct(amount);
    }
}

public class OopsQCoupling1 {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        // amazon.setService(new FedEx());
        amazon.setService(new BlueDart());
        Boolean status = amazon.DeliverTheProduct(1023.18);
        if(status){
            System.out.println(("Product delivered successfully"));
        }
        else{
            System.out.println("Product delivery failed");
        }
    }
}
