public class RentalSystem {
    public void rentVehicle(Vehicle vehicle,int rentaldays){
        vehicle.rentalDays=rentaldays;
        vehicle.calculateRentalCost();
        System.out.println("model:"+vehicle.model);
    }

    public RentalSystem(){
        var car=new Car();
        var moto=new Motorcycle();

    }
}
