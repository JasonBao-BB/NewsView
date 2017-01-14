package com.example.administrator.fragmentpractice;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsIndexFragment extends Fragment implements AdapterView.OnItemClickListener {
    private List<News> data;
    private ListView listView;
    private NewsAdapter adapter;

    public NewsIndexFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.data = getNews();
        adapter = new NewsAdapter(getContext(),R.layout.news_content,data);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_news_list, container, false);


        listView = (ListView) v.findViewById(R.id.news_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return v;
    }



    private List<News> getNews() {
        List<News> newsList = new ArrayList<News>();
        News news1 = new News();
        news1.setTitle("Succeed in College as a Learning Disabled Student");
        news1.setContent("College freshmen will soon learn to live with a roommate, adjust to a new social scene and survive less-than-stellar dining hall food. Students with learning disabilities will face these transitions while also grappling with a few more hurdles.");
        newsList.add(news1);
        News news2 = new News();
        news2.setTitle("Google Android exec poached by China's Xiaomi");
        news2.setContent("China's Xiaomi has poached a key Google executive involved in the tech giant's Android phones, in a move seen as a coup for the rapidly growing Chinese smartphone maker.");
        newsList.add(news2);
        return newsList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        News news = data.get(position);
        ContentActivity.actionStart(getActivity(),news.getTitle(),news.getContent());
    }
}
