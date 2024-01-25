public class Vehicle
{
    public String manufacturer;
    public String model;
    public int year;
    public double baseRentalPrice;
    public int rentalDays;
    public double calculateRentalCost(){
        return baseRentalPrice*rentalDays;
    }
}
