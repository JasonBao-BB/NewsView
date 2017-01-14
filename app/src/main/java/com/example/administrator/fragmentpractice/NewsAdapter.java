package com.example.administrator.fragmentpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/1/13 0013.
 */

public class NewsAdapter extends ArrayAdapter {

    private int resourceID;

    public NewsAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.resourceID = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = (News) getItem(position);
        View v = LayoutInflater.from(getContext()).inflate(resourceID,null);
        TextView title = (TextView) v.findViewById(R.id.news_item_title);
        title.setText(news.getTitle());
        return v;
    }
}
