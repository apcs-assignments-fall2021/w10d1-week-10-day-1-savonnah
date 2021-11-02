public class Bicycle extends Vehicle {
    // The Bicycle class has an additional instance variable: numGears
    private int numGears;

    // Add a constructor that takes two parameters (just maxSpeed and numGears),
    // the number of wheels is obvious for a bike
    public Bicycle(int m, int ng){
        super(m, 2);
        numGears = ng;

    }

    // Add a constructor that takes one parameter (just speed)
    // the number of wheels is obvious for a bike
    // because numGears is not supplied, the bike probably has just a single gear
    public Bicycle(int s){
        super(s, 2);
        this.numGears = 1;
    }

    // Add a default constructor (no parameters)
    public Bicycle(){
        super (30, 2);
        this.numGears = 1;
    }

    // Add a getter and setter for numGears
    public int getNumGears(){
        return this.numGears;
    }

    public void setNumGears(int input){
        this.numGears = input;
    }

    public String toString(){
        return super.toString() + " (bicycle)";
    }


    // No other code needed
}
