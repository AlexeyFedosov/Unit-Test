package ru.geekbrains.coverage;

public class User {
    String name;
    String pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public boolean auth(String nameUser, String passUser) {
        if (name.equals(nameUser) && pass.equals(passUser)){
            return true;
        } else {
            return false;
        }

    }
}
