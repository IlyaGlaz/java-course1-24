package lesson5;

public class Elevator {

    int maxFloor;
    int minFloor;
    int currentFloor = 1;

    public Elevator(int maxFloor, int minFloor, int currentFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        this.currentFloor = currentFloor;
    }

    private void moveUp() {
        currentFloor = currentFloor + 1;
    }

    private void downUp() {
        currentFloor = currentFloor - 1;
    }

    int move(int floor) {
        for (int i = currentFloor; i < floor; i++) {
            moveUp();
            System.out.println(currentFloor);
        }
        return currentFloor;
    }
}
