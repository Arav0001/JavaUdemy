public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        Holden holden = new Holden(6, "Holden Commodore");
        Ford ford = new Ford(6, "Ford Falcon");

        System.out.println("Polymorphism Cars");

        System.out.println(

            "\n" + car.startEngine() +
            "\n" + car.accelerate() +
            "\n" + car.brake() +

            "\n" +

            "\n" + mitsubishi.startEngine() +
            "\n" + mitsubishi.accelerate() +
            "\n" + mitsubishi.brake() +

            "\n" +

            "\n" + holden.startEngine() +
            "\n" + holden.accelerate() +
            "\n" + holden.brake() +

            "\n" +

            "\n" + ford.startEngine() +
            "\n" + ford.accelerate() +
            "\n" + ford.brake()
        );
    }
}