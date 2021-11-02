public class Car extends Vehicle {
    // The Car class has no additional instance variables


    // Add a constructor that takes two parameters (maxSpeed and numWheels)
    public Car(int m, int n){
        super(m,n);

    }

    // Add a constructor that takes one parameter (just speed),
    public Car(int s){
        super(s, 4);
    }

    // the number of wheels is obvious for a car

    // Add a default constructor (no parameters)
    public Car(){
        super(100,4);
    }

    public String toString(){
        return super.toString() + " (car)";
    }

    // No other code needed
}
