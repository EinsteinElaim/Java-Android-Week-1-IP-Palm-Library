package com.moringaschool.palmlibrary;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SearchFragment extends Fragment implements View.OnClickListener{
    Intent intent;
    String search;
    View view;
    @BindView(R.id.editTextSearchLibrary) EditText searchText;
    @BindView(R.id.buttonSearchLibrary) Button searchLibrary;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this.getActivity());

        search = searchText.getText().toString();

        searchLibrary.setOnClickListener(this);


        return view;
//        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), SearchResultsActivity.class);
        i.putExtra("searchText", search);
        Log.d("SearchBtnClicked", search);
        startActivity(i);
    }

}