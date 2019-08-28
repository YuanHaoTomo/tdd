package com.tdd.course03;

public class MarsRover {

    private int x;
    private int y;
    private DirectionEnum direction;

    public MarsRover(int x, int y, DirectionEnum e) {
        this.x = x;
        this.y = y;
        this.direction = e;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }
}
