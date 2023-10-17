package com.bilgee.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public void arrayListMethod () {
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(0,0);
        scoreList.add(1,10);
        scoreList.add(2,20);
        scoreList.add(3,30);

        System.out.println(scoreList);
    }

    public void linkedListMethod () {
        LinkedList<Integer> scoreList = new LinkedList<>();
        scoreList.add(0,1);
        scoreList.add( 1,2 );
        scoreList.add( 2,3 );

        System.out.println(scoreList);

    }
}
