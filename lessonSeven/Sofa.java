package by.itacademy.lessonSeven;

public class Sofa extends Furniture {
    private String name;
    private int area;

    public Sofa(String name, int area) {
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