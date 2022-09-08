package io.ugurh.design_pattern.strategy.encryption;

public class AES256 implements Encrypter{
    @Override
    public void encrypt() {
        System.out.println("Encryption by AES256");
    }

    @Override
    public void decrypt() {
        System.out.println("Decryption by AES256");
    }
}
