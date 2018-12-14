package com.example.baiyang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit>fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFruits();
        setContentView(R.layout.activity_main);
    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana=new Fruit("banana",R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange=new Fruit("orange",R.drawable.orange_pic);
            fruitList.add(orange);
        }
    }

    private class Fruit { private  String name;
        private int imageId;
        public Fruit(String name,int imageId){
            this.name=name;
            this.imageId=imageId;

        }
        public String getName(){
            return name;
        }

        public int getImageId() {
            return imageId;
        }
    }
}
