public class Test {
    public static void main(String[] args) {
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(120,2);
        Bed bed = new Bed("european" , 3 , 30,2,2);
        Lamp lamp = new Lamp("European", false, 50);
        Bedroom bedroom = new Bedroom("Onur's" , wall1,wall2,wall3,wall4,bed,ceiling,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }
}
