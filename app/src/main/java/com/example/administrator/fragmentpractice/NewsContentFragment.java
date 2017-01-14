package com.example.administrator.fragmentpractice;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsContentFragment extends Fragment {

    private TextView title, content;
    private View v;
    public NewsContentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_news_content, container, false);
        this.title = (TextView) v.findViewById(R.id.news_title1);
        this.content = (TextView) v.findViewById(R.id.news_content1);
        return v;
    }

    public void parseData(String title, String content) {
        this.title.setText(title);
        this.content.setText(content);
    }

}
