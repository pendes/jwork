package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    
    Rank[] ranks = {
        new Rank(1, "takarító"),
        new Rank(2, "portás"),
        new Rank(2, "építész"),
        new Rank(2, "gondnok"),
    };
    public Vector<Rank> rankList = new Vector<>(Arrays.asList(ranks));
    
}
