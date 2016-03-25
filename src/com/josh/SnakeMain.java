package com.josh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by ec0662sr on 3/24/2016.
 */
public class SnakeMain {

    public static void main(String[] args) {

        Snake rattlesnake = new Snake("Rattlesnake", 4);
        Snake seaSnake = new Snake("Sea Snake", 9);
        Snake greenMamba = new Snake("Green Mamba", 9);
        Snake cobra = new Snake("Cobra", 5);
        Snake boaConstrictor = new Snake("Boa Constrictor", 0);

        LinkedList<Snake> snakeList = new LinkedList<>();

        snakeList.add(rattlesnake);
        snakeList.add(seaSnake);
        snakeList.add(greenMamba);
        snakeList.add(cobra);
        snakeList.add(boaConstrictor);

        Collections.sort(snakeList);

        System.out.println(snakeList);

    }
}

