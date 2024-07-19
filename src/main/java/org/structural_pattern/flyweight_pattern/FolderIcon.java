package org.structural_pattern.flyweight_pattern;

public class FolderIcon implements Icon{

    private String color;
    private String imageName;

    public FolderIcon(String color, String imageName) {
        this.color = color;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing folder icon with color " + color + " and image " + imageName + " at position (" + x + ", " + y + ")");
    }
}
