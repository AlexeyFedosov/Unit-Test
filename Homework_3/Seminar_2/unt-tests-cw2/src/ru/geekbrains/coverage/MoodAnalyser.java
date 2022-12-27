package ru.geekbrains.coverage;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("грустное")) {
            return "Sad";
        } else return "Happy";

    }
}
