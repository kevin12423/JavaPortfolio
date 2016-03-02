/**
 * Created by kevin_000 on 2/22/2016.
 */
public class VehicleDriver
{
    public static void main(String[] args)
    {
        //creates two vehicles one being a car one being a truck
        //calls the accelerate method on both and displays the speed
        Vehicle vehicleOne = new Car();
        vehicleOne.accelerate();
        System.out.println(vehicleOne.getSpeed() + " MPH");
        Vehicle vehicleTwo = new Truck();
        vehicleTwo.accelerate();
        System.out.println(vehicleTwo.getSpeed() + " MPH");
        }
        }
