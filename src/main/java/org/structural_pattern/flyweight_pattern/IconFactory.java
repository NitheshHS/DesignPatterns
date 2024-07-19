package org.structural_pattern.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key){
        if(iconCache.containsKey(key)){
            return iconCache.get(key);
        }else {
            Icon icon;
            if (key.equalsIgnoreCase("file")) {
                icon = new FileIcon("document", "document.png");
            } else if (key.equalsIgnoreCase("folder")) {
                icon = new FolderIcon("blue", "folder.png");
            } else {
                throw new IllegalArgumentException("Unsupported icon: " + key);
            }
            iconCache.put(key, icon);
            return icon;
        }
    }
}
