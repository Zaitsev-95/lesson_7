package by.itacademy.lessonSeven;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("it-academy");
        try {
            building.addRoom("Аудитория 57", 100, 4);
            building.add(0, new Bulb(150));
            building.add(0, new Bulb(250));
        } catch (IlluminationLimitException e) {
            System.err.println(e.getMessage());
        }
        try {
            building.add(0, new Table("Стол", 15));
            building.add(0, new Chair("Стул", 5));
        } catch (SpaceLimitException e) {
            System.err.println(e.getMessage());
        }
        try {
            building.addRoom("Аудитория 58(комната отдыха)", 100, 5);
            building.add(1, new Bulb(150));
            building.add(1, new Bulb(150));
            building.add(1, new Bulb(150));
            building.add(1, new Bulb(250));
        } catch (IlluminationLimitException e) {
            System.err.println(e.getMessage());
        }
        try {
            building.add(1, new Table("Стол деревянный, коричневый", 15));
            building.add(1, new Chair("Стул металический", 5));
            building.add(1, new Sofa("Диван мягкий, кожаный", 20));
            building.add(1, new Armchair("Кресло мягкое, кожаное", 10));
            building.add(1, new Armchair("Кресло мягкое, кожаноe", 1));
            building.add(1, new StereoSystem("Стерео система", 5));
        } catch (SpaceLimitException e) {
            System.err.println(e.getMessage());
        }
        try {
            building.addRoom("Чулан", 4, 1);
            building.add(2, new Bulb(350));
        } catch (IlluminationLimitException e) {
            System.err.println(e.getMessage());
        }
        building.outputInfo();
    }
}