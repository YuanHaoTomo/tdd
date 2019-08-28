package com.tdd.course03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MarsSchema {

    private List<String> cmdList;

    public MarsSchema(MarsRover marsRover, String s) {
        cmdList=Arrays.asList(s.split(" "));
        processingCommand(marsRover);
    }

    private void processingCommand(MarsRover marsRover) {
        for (String cmd : cmdList) {
            if(cmd.startsWith("-l") || cmd.startsWith("-r")){
                adjustDirection(marsRover, cmd.substring(1));
            }
            if(cmd.startsWith("-f") || cmd.startsWith("-b")){
                move(marsRover, cmd.substring(1,2), cmd.substring(2));
            }
        }
    }

    /**
     * 移动
     *
     * @param marsRover
     * @param key
     */
    private void move(MarsRover marsRover, String key, String value) {
        if (marsRover.getDirection().equals(DirectionEnum.N)) {
            if (key.equals("f")) {
                marsRover.setY(marsRover.getY() + new Integer(value));
            }
            if (key.equals("b")) {
                marsRover.setY(marsRover.getY() - new Integer(value));
            }
        }
        if (marsRover.getDirection().equals(DirectionEnum.E)) {
            if (key.equals("f")) {
                marsRover.setX(marsRover.getX() + new Integer(value));
            }
            if (key.equals("b")) {
                marsRover.setX(marsRover.getX() - new Integer(value));
            }
        }
        if (marsRover.getDirection().equals(DirectionEnum.S)) {
            if (key.equals("f")) {
                marsRover.setY(marsRover.getY() + new Integer(value));
            }
            if (key.equals("b")) {
                marsRover.setY(marsRover.getY() - new Integer(value));
            }
        }
        if (marsRover.getDirection().equals(DirectionEnum.W)) {
            if (key.equals("f")) {
                marsRover.setX(marsRover.getX() - new Integer(value));
            }
            if (key.equals("b")) {
                marsRover.setX(marsRover.getX() + new Integer(value));
            }
        }

    }


    /**
     * 调整方向
     *
     * @param marsRover
     * @param key
     */
    private void adjustDirection(MarsRover marsRover, String key) {
        List<DirectionEnum> directionEnumList = Arrays.asList(DirectionEnum.E, DirectionEnum.S, DirectionEnum.W, DirectionEnum.N);
        for (int i = 0; i <= 3; i++) {
            if (marsRover.getDirection().equals(directionEnumList.get(i))) {
                if (key.equals("r") && i == 3) {
                    marsRover.setDirection(directionEnumList.get(0));
                    break;
                } else if (key.equals("r")) {
                    marsRover.setDirection(directionEnumList.get(i + 1));
                    break;
                } else if (key.equals("l") && i == 0) {
                    marsRover.setDirection(directionEnumList.get(3));
                    break;
                } else if (key.equals("l")) {
                    marsRover.setDirection(directionEnumList.get(i - 1));
                    break;
                }
            }
        }
    }

}
