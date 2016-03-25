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
        return "Snake " + species + " has a venom rating of " + venomRating + ". ";
    }


    @Override
    public int compareTo(Snake x)             //had help from Jake in class on getting this to take into
    {                                         //consideration the name of the snake when venom rating was the same
        int toReturn = 0;
        if (this.venomRating > x.venomRating) toReturn = 1;
        if (this.venomRating < x.venomRating) toReturn = -1;
        if (this.venomRating == x.venomRating) toReturn = this.species.compareTo(x.species);

        return toReturn;
    }
}




