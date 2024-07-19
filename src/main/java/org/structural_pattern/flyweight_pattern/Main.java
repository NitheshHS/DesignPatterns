package org.structural_pattern.flyweight_pattern;

public class Main {
    public static void main(String[] args) {
        IconFactory iconFactory=new IconFactory();
        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(10,20);

        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(5,4);
    }
}
