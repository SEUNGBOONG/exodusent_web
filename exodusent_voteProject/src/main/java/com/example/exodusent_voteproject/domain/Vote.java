package com.example.exodusent_voteproject.domain;

public class Vote {

    private int jajang;
    private int jjamppong;

    public Vote() {
        this.jajang = 0;
        this.jjamppong = 0;
    }

    public void vote(String choice) {
        if ("jajang".equals(choice)) {
            jajang++;
        } else if ("jjamppong".equals(choice)) {
            jjamppong++;
        }
    }

    public int getJajang() {
        return jajang;
    }

    public int getJjamppong() {
        return jjamppong;
    }
}
