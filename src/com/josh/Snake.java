package com.josh;

import java.util.LinkedList;

public class Snake implements Comparable<Snake>{


        String species;
        double venomRating;
        public Snake(String s, double v){
            this.species = s;
            this.venomRating = v;
        }

    @Override
    public String toString() {
        return "Snake " + species + " has a venom rating of " + venomRating + ". \n";
    }


    @Override
    public int compareTo(Snake x) {

    if (this.venomRating > x.venomRating) {
        return 1;
    } else if (this.venomRating < x.venomRating) {
        return -1;
    } else {
        return 0;



    }
}
    }



