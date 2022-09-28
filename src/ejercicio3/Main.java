package ejercicio3;

public class Main {
    public static void main(String[] args) {

        // Primera parte

        int result = add(3,2,3);
        System.out.println(result);

        // Segunda parte

        Car car = new Car(3);
        car.addDoor();
        System.out.println(car.getDoors());

    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

}

class Car {
    private int doors;
    public Car(int doors) {
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void addDoor() {
        this.doors++;
    }

}