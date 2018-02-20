package com.example.awesomefat.towerofhanoi_csc300_spring2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button tower0Button;
    private Button tower1Button;
    private Button tower2Button;
    private Tower tower0;
    private Tower tower1;
    private Tower tower2;
    private Disk disk0;
    private Disk disk1;
    private Disk disk2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tower0Button = (Button)this.findViewById(R.id.tower0Button);
        this.tower1Button = (Button)this.findViewById(R.id.tower1Button);
        this.tower2Button = (Button)this.findViewById(R.id.tower2Button);
        this.disk0 = new Disk(0);
        this.disk1 = new Disk(1);
        this.disk2 = new Disk(2);
        this.tower0 = null;
        this.tower1 = null;
        this.tower2 = null;

    }
    public void popButton1Clicked(View v)
    {

        if(this.tower0 == null)
        {
            tower0.push(disk2);
            this.disk2.setNextDisk(disk1);
            this.disk1.setNextDisk(disk0);
            this.tower0.display();
        }
        else
        {
            tower0.pop();
        }
    }
    public void popButton2Clicked(View v)
    {
        if(this.tower1 == null)
        {
            tower1.display();
        }
        else
        {
            tower1.pop();
        }
    }
    public void popButton3Clicked(View v)
    {
        if(this.tower2 == null)
        {
            tower2.display();
        }
        else
        {
            tower2.pop();
        }
    }
}
