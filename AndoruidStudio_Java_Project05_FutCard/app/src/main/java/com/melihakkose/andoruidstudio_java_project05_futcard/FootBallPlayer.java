package com.melihakkose.andoruidstudio_java_project05_futcard;

import java.io.Serializable;

public class FootBallPlayer implements Serializable {

    private String name;
    private String team;
    private String position;
    private int picInteger;
    private int overall;
    private int age;

    public FootBallPlayer(String name, String team, String position, int picInteger, int overall, int age) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.picInteger = picInteger;
        this.overall = overall;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public int getPicInteger() {
        return picInteger;
    }

    public int getOverall() {
        return overall;
    }

    public int getAge() {
        return age;
    }
}
