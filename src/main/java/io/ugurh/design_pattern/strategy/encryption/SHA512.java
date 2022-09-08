package io.ugurh.design_pattern.strategy.encryption;

public class SHA512 implements Encrypter{
    @Override
    public void encrypt() {
        System.out.println("Encryption by SHA512");
    }

    @Override
    public void decrypt() {
        System.out.println("Decryption by SHA512");
    }
}
