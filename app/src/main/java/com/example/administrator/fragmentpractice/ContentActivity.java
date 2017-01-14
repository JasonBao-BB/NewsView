package com.example.administrator.fragmentpractice;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContentActivity extends AppCompatActivity {

    public static void actionStart(Context context, String newsTitle,
                                   String newsContent) {
        Intent intent = new Intent(context, ContentActivity.class);
        intent.putExtra("news_title", newsTitle);
        intent.putExtra("news_content", newsContent);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        String title = getIntent().getStringExtra("news_title");
        String content = getIntent().getStringExtra("news_content");

//        NewsContentFragment contentFragment = new NewsContentFragment();
//        contentFragment.parseData(title,content);
//        if (contentFragment != null) {
//            getSupportFragmentManager().beginTransaction().add(R.id.content_container,contentFragment).commit();
//        }
        NewsContentFragment fragment =(NewsContentFragment) getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
        fragment.parseData(title,content);
    }
}
