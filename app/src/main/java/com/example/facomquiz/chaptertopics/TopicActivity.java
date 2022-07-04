package com.example.facomquiz.chaptertopics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.example.facomquiz.R;
import com.example.facomquiz.chapter.five.javaScript;
import com.example.facomquiz.chapter.one.Android;
import com.example.facomquiz.chapter.one.java;
import com.example.facomquiz.chapter.two.php;

public class TopicActivity extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String chapterName;
    TopicAdapter adapter;
    String arr[] = null;
    ImageView chapterImage;

    String chapter1[] = {"Java","Android","Em breve","Em breve","Em breve","Em breve"};
    String chapter2[] = {"PHP","Em breve","Em breve","Em breve","Em breve","Em breve"};
    String chapter3[] = {"Em breve","Em breve","Em breve","Em breve","Em breve","Em breve"};
    String chapter4[] = {"Em breve","Em breve","Em breve","Em breve","Em breve","Em breve"};
    String chapter5[] = {"Javascript","Em breve","Em breve","Em breve","Em breve","Em breve"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        chapterName = getIntent().getStringExtra("chapterName");
        chapterImage = findViewById(R.id.chapter_image);

        compareAndOpen();

        
    }

    private void compareAndOpen() {
        if (chapterName.equals("heading1")) {
            arr = chapter1;
            chapterImage.setImageResource(R.drawable.linked_list);
        }
        else if (chapterName.equals("heading2")) {
            arr = chapter2;
            chapterImage.setImageResource(R.drawable.stack);
        }
        else if (chapterName.equals("heading3")) {
            arr = chapter3;
            chapterImage.setImageResource(R.drawable.graph);
        }
        else if (chapterName.equals("heading4")) {
            arr = chapter4;
            chapterImage.setImageResource(R.drawable.tree);
        }
        else if (chapterName.equals("heading5")) {
            arr = chapter5;
            chapterImage.setImageResource(R.drawable.list);
        }
        else
            arr = null;

        adapter = new TopicAdapter(arr,TopicActivity.this);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener((adapterView, view, i, l) -> {

            openActivity(arr[i]);
        });
    }

    private void openActivity(String s){
        switch (s){
            case "Java":
                startActivity(new Intent(TopicActivity.this, java.class));
                break;
            case "Android":
                startActivity(new Intent(TopicActivity.this, Android.class));
                break;
            case "PHP":
                startActivity(new Intent(TopicActivity.this, php.class));
                break;
            case "Javascript":
                startActivity(new Intent(TopicActivity.this, javaScript.class));
                break;


        }
    }
}