package by.itacademy.lessonSeven;

import java.util.ArrayList;

public class Room {
    private String name;
    private int area;
    private int windows;
    private ArrayList<Bulb> bulbList = new ArrayList<>();
    private ArrayList<Furniture> furnitureList = new ArrayList<>();

    Room(String name, int area, int windows) throws IlluminationLimitException {
        this.name = name;
        this.area = area;
        this.windows = windows;
        illuminationSum(0);
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getWindows() {
        return windows;
    }

    public ArrayList<Bulb> getBulbList() {
        return bulbList;
    }

    public ArrayList<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void addBulb(Bulb bulb) {
        bulbList.add(bulb);
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public int qetWindowsIllumination() {
        return windows * 700;
    }

    public int getBulbsIllumination() {
        int sum = 0;
        for (Bulb bulb : bulbList)
            sum += bulb.getLuminosity();
        return sum;
    }

    public int getSquareOccupied() {
        int sum = 0;
        for (Furniture furniture : furnitureList)
            sum += furniture.getArea();
        return sum;
    }

    public void illuminationSum(int bulbLuminosity) throws IlluminationLimitException {
        int sum = 0;
        for (Bulb bulb : bulbList)
            sum += bulb.getLuminosity();
        sum += bulbLuminosity + windows * 700;
        if (sum < 300 || 4000 < sum) {
            throw new IlluminationLimitException(name + "- нарушено освещение!");
        }
    }

    public void spaceSum(int furnitureSquare) throws SpaceLimitException {
        int sum = 0;
        int fullness = 100 * sum / area;
        for (Furniture furniture : furnitureList)
            sum += furniture.getArea();
        sum += furnitureSquare;
        if (fullness > 70) {
            throw new SpaceLimitException(name + "- помещение переполнено!");
        }
    }
}