package com.ruchirajkarki.socialapp.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mancj.materialsearchbar.MaterialSearchBar;
import com.ruchirajkarki.socialapp.R;
import com.ruchirajkarki.socialapp.adapters.SearchResultAdapter;
import com.ruchirajkarki.socialapp.models.SearchResultModel;

import java.util.ArrayList;
import java.util.Random;

public class Search extends Fragment implements MaterialSearchBar.OnSearchActionListener {

    MaterialSearchBar searchBar;
    ArrayList<SearchResultModel> mSearchResultModels;
    RecyclerView searchResultRV;

    public Search() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        searchBar = view.findViewById(R.id.searchBar);
        searchBar.setOnSearchActionListener(this);


        populateSearchResult(view);


//        searchBar.setText("Hello World!");

        Log.d("LOG_TAG", getClass().getSimpleName() + ": text " + searchBar.getText());
        searchBar.setCardViewElevation(10);
        searchBar.openSearch();
        searchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("LOG_TAG", getClass().getSimpleName() + " text changed " + searchBar.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return view;
    }

    @Override
    public void onSearchStateChanged(boolean enabled) {
    }

    @Override
    public void onSearchConfirmed(CharSequence text) {

    }

    @Override
    public void onButtonClicked(int buttonCode) {
        if (buttonCode == MaterialSearchBar.BUTTON_BACK) {
            searchBar.closeSearch();
        }
    }

    private void populateSearchResult(View view){
        searchResultRV = view.findViewById(R.id.search_result_rv);
        mSearchResultModels = new ArrayList<>();
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));
        mSearchResultModels.add(new SearchResultModel(randomImageURL(),"KP Oli","Prime Minister"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(mSearchResultModels,getContext());
        searchResultRV.setLayoutManager(linearLayoutManager);
        searchResultRV.setNestedScrollingEnabled(false);
        searchResultRV.setAdapter(searchResultAdapter);
    }
    private String randomImageURL(){
        String URL = "https://picsum.photos/500/300?random=" + String.valueOf(new Random().nextInt(1000));
        return URL;
    }

}

