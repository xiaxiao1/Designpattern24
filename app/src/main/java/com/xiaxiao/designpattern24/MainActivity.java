package com.xiaxiao.designpattern24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xiaxiao.designpattern24.decorator.ColorHairDecorator;
import com.xiaxiao.designpattern24.decorator.Girl;
import com.xiaxiao.designpattern24.decorator.LongHairDecorator;
import com.xiaxiao.designpattern24.decorator.interfaces.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void decorator(View view) {
        Person girl;
        girl = new Girl("Lucy");
        girl.showHair();
        girl = new ColorHairDecorator(girl, "红色");
        girl = new LongHairDecorator(girl);
        girl.showHair();
    }

    public void printMes(String mes) {
        System.out.println(mes);

    }
}
