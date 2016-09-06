package edu.orangecoastcollege.cs273.jcabrera31.tapcounter;

/**
 * Created by jcabrera31 on 9/6/2016.
 */
public class Counter {

    private int mCount;

    //constructor
    public Counter(){
        mCount = 0;
    }

    public void addCount(){
        mCount += 1;
    }
    public int getCount(){
        return mCount;
    }
}
