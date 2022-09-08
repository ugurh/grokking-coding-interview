package io.ugurh.design_pattern.strategy.encryption;

public class Test {

    public static void main(String[] args) {
        Encryption encryption = new Encryption(new AES256());

        encryption.encrypt();
        encryption.decrypt();

        encryption.setEncrypter(new SHA512());

        encryption.encrypt();
        encryption.decrypt();
    }
}
