package com.tdd.course03;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void marsRoverTest() {
        MarsRover marsRover = new MarsRover(0, 0, DirectionEnum.E);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-l");
        Assert.assertEquals(marsRover.getDirection(), DirectionEnum.N);
        marsRover = new MarsRover(0, 1, DirectionEnum.N);
        marsSchema = new MarsSchema(marsRover, "-l");
        Assert.assertEquals(marsRover.getDirection(), DirectionEnum.W);
    }
    @Test
    public void marsRoverTest1() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(0, 1, DirectionEnum.W);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-r");
        Assert.assertEquals(marsRover.getDirection(), DirectionEnum.N);
    }
    @Test
    public void marsRoverTest2() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(0, 0, DirectionEnum.E);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-f30");
        Assert.assertEquals(marsRover.getX(), 30);
    }
    @Test
    public void marsRoverTest3() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(0, 30, DirectionEnum.S);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-f30");
        Assert.assertEquals(marsRover.getY(), 60);
    }
    @Test
    public void marsRoverTest4() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(30, 30, DirectionEnum.W);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-f30");
        Assert.assertEquals(marsRover.getX(), 0);
    }
    @Test
    public void marsRoverTest5() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(30, 30, DirectionEnum.N);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-b30");
        Assert.assertEquals(marsRover.getY(), 0);
    }

    @Test
    public void marsRoverTest6() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(30, 30, DirectionEnum.N);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-l -b30");
        Assert.assertEquals(marsRover.getX(), 60);
        Assert.assertEquals(marsRover.getY(), 30);
    }
    @Test
    public void marsRoverTest7() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(30, 30, DirectionEnum.N);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-l");
        Assert.assertEquals(marsRover.getDirection(), DirectionEnum.W);
    }
    @Test
    public void marsRoverTest8() {
        Mars mars = new Mars(100, 90);
        MarsRover marsRover = new MarsRover(0, 0, DirectionEnum.E);
        MarsSchema marsSchema = new MarsSchema(marsRover, "-f60 -b10 -l -f10 -l -b15 -r -f20 -b10");
        Assert.assertEquals(marsRover.getDirection(), DirectionEnum.N);
        Assert.assertEquals(marsRover.getX(), 65);
        Assert.assertEquals(marsRover.getY(), 20);
    }
}
