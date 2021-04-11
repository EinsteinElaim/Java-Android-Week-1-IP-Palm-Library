package com.moringaschool.palmlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import butterknife.BindView;

public class SearchResultsActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.listViewTitle) ListView mListViewTitle;


    String[] titles = new String[] {
            "Diary of Anne Frank", "Atlas", "Betty Crocker Cookbook", "The Sun Also Rises", "To Kill A Mockingbird"
            , "Killing England", "A Confederacy of Dunes", "The 7 Habits of Highly Effective People"
    };
    String[] genres = new String[] {
            "Non fiction - Journal", "Non fiction - Atlas", "Factual - Food", "Fiction", "Fiction",
            "Non fiction - History", "Non fiction - Politics", "Self Help"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, titles);
        mListViewTitle.setAdapter(adapter);


        Intent intent = getIntent();
        String searchedText = intent.getExtras().getString("searchText");
        Log.d("IntentExtraSearchResultCaught", searchedText);

    }


    @Override
    public void onClick(View v) {
        if (v == mListViewTitle) {
            String title = ((TextView) v).getText().toString();
            Toast.makeText(SearchResultsActivity.this, title, Toast.LENGTH_LONG).show();
        }
    }


}