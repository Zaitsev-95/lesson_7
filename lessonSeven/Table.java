package by.itacademy.lessonSeven;

public class Table extends Furniture {
    private String name;
    private int area;

    public Table(String name, int area) {
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