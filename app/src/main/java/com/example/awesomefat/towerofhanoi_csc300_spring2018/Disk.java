package com.example.awesomefat.towerofhanoi_csc300_spring2018;

/**
 * Created by awesomefat on 2/15/18.
 */

public class Disk
{
    private int size;
    private Disk nextDisk;

    public Disk(int size)
    {
        this.size = size;
        this.nextDisk = null;
    }
    public void display()
    {
        System.out.println(this.size);
        if(this.nextDisk != null)
        {
            this.nextDisk.display();
        }
    }
    public int getSize()
    {
        return size;
    }

    public Disk getNextDisk()
    {
        return nextDisk;
    }

    public void setNextDisk(Disk nextDisk)
    {
        this.nextDisk = nextDisk;
    }

}
