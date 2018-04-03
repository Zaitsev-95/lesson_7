package by.itacademy.lessonSeven;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> roomsList = new ArrayList<>();

    Building(String name) {
        this.name = name;
    }

    public void addRoom(String name, int area, int windows) throws IlluminationLimitException {
        roomsList.add(new Room(name, area, windows));
    }

    public void add(int roomIndex, Bulb bulb) throws IlluminationLimitException {
        roomsList.get(roomIndex).illuminationSum(bulb.getLuminosity());
        roomsList.get(roomIndex).addBulb(bulb);
    }

    public void add(int roomIndex, Furniture furniture) throws SpaceLimitException {
        roomsList.get(roomIndex).spaceSum(furniture.getArea());
        roomsList.get(roomIndex).addFurniture(furniture);
    }

    public void outputInfo() {
        System.out.println(name);
        for (Room room : roomsList) {
            System.out.println(" " + room.getName());
            System.out.print("\tОсвещённость = " + (room.qetWindowsIllumination() + room.getBulbsIllumination()));
            System.out.print(" (" + room.getWindows() + " окна по 700 лк, лампочки ");
            for (Bulb bulb : room.getBulbList()) {
                System.out.print(bulb.getLuminosity() + " лк, ");
            }
            System.out.println(")");
            System.out.println("\tПлощадь = " + room.getArea() + " м^2 (занято: " + room.getSquareOccupied() + " м^2, свободно: " + (room.getArea() - room.getSquareOccupied()) + " м^2 или " + 100 * (room.getArea() - room.getSquareOccupied()) / room.getArea() + "% площади)");
            if (!room.getFurnitureList().isEmpty()) {
                System.out.println("\t Furniture:");
                for (Furniture furniture : room.getFurnitureList()) {
                    System.out.println("\t  " + furniture.getName() + " (площадь " + furniture.getArea() + " м^2)");
                }
            } else System.out.println("\t Мебели нет");
        }
    }
}