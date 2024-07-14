package org.prototype;

public class Main {
    public static void main(String[] args) {
        Certificate certificate = new Certificate("Driving license");
        certificate.displayContent();
        System.out.println("copy1: address "+certificate);
        Document deepCopyCertificate = certificate.clone();
        deepCopyCertificate.displayContent();
        System.out.println("copy2: address "+deepCopyCertificate);
    }
}
