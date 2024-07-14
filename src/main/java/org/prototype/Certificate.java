package org.prototype;

public class Certificate implements Document {
    private final String content;

    public Certificate(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new Certificate(this.content);
    }

    @Override
    public void displayContent() {
        System.out.println("Certificate: "+content);
    }
}
