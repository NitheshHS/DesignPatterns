package org.prototype;

public class NDA implements Document {

    private String content;

    public NDA(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return null;
    }

    @Override
    public void displayContent() {
        System.out.println("NDA: "+this.content);
    }
}
