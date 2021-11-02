import java.util.Arrays;

public class NumberArray {
    private int[] arr;

    // Creates a NumberArray
    public NumberArray(int number, int size) {
        // Note that we first need to MAKE the array
        arr = new int[size];

        // And then we need to fill the array!
        for (int i = 0; i < size; i++) {
            arr[i] = number;
        }
    }

    // Returns the value at the given index of our array
    public int getAtIndex(int index) {
        return this.arr[index];
    }

    // Sets the value at the given index of our array
    public void setAtIndex(int index, int newValue) {
        this.arr[index] = newValue;
    }

    // Calls Arrays.toString for the toString method
    public String toString() {
        return "NumberArray contains: " + Arrays.toString(this.arr);
    }
}
