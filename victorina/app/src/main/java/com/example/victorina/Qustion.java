package com.example.victorina;

public class Qustion {
    private int qustion;

    private boolean isCorrect;

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getQustion() {
        return qustion;
    }

    public void setQustion(int qustion) {
        this.qustion = qustion;
    }

    public Qustion(boolean isCorrect, int qustion) {
        this.isCorrect = isCorrect;
        this.qustion = qustion;
    }


}
