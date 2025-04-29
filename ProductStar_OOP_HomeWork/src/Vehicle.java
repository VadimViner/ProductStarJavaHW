public class Vehicle implements Drivable{
    String name;
    int horsePower;
    int weight;
    String type;
    Engine engine;
    DrivingWheel drivingWheel;
 public Vehicle(String name, int horsePower, int weight, String type, Engine engine, DrivingWheel drivingWheel){
     this.name = name;
     this.horsePower = horsePower;
     this.weight = weight;
     this.type = type;
     this.engine = engine;
     this.drivingWheel = drivingWheel;
 }
public void startDrive(){
    System.out.println("Начать ехать");
}
public void finishDrive(){
    System.out.println("Остановиться");
}

public void describeVehicle(){
    System.out.println("Автомобиль: " + name + "; Мощность " + horsePower + "; Вес: " + weight + "; Вид: " + type + ";");
}
}
