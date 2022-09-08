package io.ugurh.design_pattern.strategy.encryption;

public class Encryption {

    Encrypter encrypter;

    public Encryption(Encrypter encrypter){
        this.encrypter = encrypter;
    }

    public void encrypt() {
        encrypter.encrypt();
    }

    public void decrypt() {
        encrypter.decrypt();
    }

    void setEncrypter(Encrypter encrypter){
        this.encrypter = encrypter;
    }

}
