public class asansor1 {
    public static void main(String[] args) {
        int[] warningFloors = {25, 30, 35}; // Floors where warnings are given
        int totalFloors = 40;

        for (int currentFloor = 1; currentFloor <= totalFloors; currentFloor++) {
            System.out.println("Elevator is on floor: " + currentFloor);

            // Check if the current floor is in the warning list
            for (int floor : warningFloors) {
                if (currentFloor == floor) {
                    System.out.println("Warning: Approaching floor " + currentFloor + "!");
                }
            }
        }
    }
}
