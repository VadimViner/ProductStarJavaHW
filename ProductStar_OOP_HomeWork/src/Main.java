public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        DrivingWheel drivingWheel1 = new DrivingWheel();
        Vehicle car1 = new Vehicle("Тойота", 150, 700, "Седан", engine1, drivingWheel1);
        car1.describeVehicle();

        engine1.turnOn();
        car1.startDrive();
        drivingWheel1.turn();
        car1.finishDrive();
        engine1.turnOff();

    }
}