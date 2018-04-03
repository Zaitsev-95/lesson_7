package by.itacademy.lessonSeven;

public class Chair extends Furniture {
    private String name;
    private int area;

    public Chair(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getArea() {

        return area;
    }
}