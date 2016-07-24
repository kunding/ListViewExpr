package com.chen.listviewexer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.chen.listviewexer.bean.Fruit;
import com.chen.listviewexer.bean.FruitAdapter;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private ListView mListView=null;
    private List<Fruit> mFruitList=null;
    private List<Fruit> fruitList = new ArrayList<Fruit>();
   // private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple",
      //      "Strawberry", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,mFruitList);

        ListView listView = (ListView) findViewById(R.id.activity_main_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getmName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        String[] fruitName = {"apple", "banana", "orange", "watermelon", "pear", "grape",
                "Pineapple", "strawberry", "cherry", "apple", "banana", "orange"};
        int[] fruitImages = {R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic,
                R.drawable.watermelon_pic, R.drawable.pear_pic, R.drawable.grape_pic,
                R.drawable.pineapple_pic, R.drawable.strawberry_pic, R.drawable.cherry_pic,
                R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic};
        mFruitList = new ArrayList<Fruit>();
        for (int i = 0; i < fruitName.length; i++) {
            Fruit fruit = new Fruit(fruitName[i], fruitImages[i]);
            mFruitList.add(fruit);
        }
    }

}
