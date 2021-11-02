public class Vehicle {
    private int maxSpeed;
    private int numWheels;

    public Vehicle(int maxSpeed, int numWheels) {
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public Vehicle() {
        this.maxSpeed = 100;
        this.numWheels = 4;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString() {
        return "This vehicle has " + numWheels + " wheels and a max speed of " + maxSpeed;
    }
}
