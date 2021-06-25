package com.ruchirajkarki.socialapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ruchirajkarki.socialapp.R;
import com.ruchirajkarki.socialapp.adapters.DashboardAdapter;
import com.ruchirajkarki.socialapp.adapters.StoryAdapter;
import com.ruchirajkarki.socialapp.models.DashboardModel;
import com.ruchirajkarki.socialapp.models.StoryModel;

import java.util.ArrayList;
import java.util.Random;


public class Home extends Fragment {

    RecyclerView storyRV, dashboardRV;
    ArrayList<StoryModel> mStoryModelArrayList;
    ArrayList<DashboardModel> mDashboardModelArrayList;
    public Home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Populate_storyRV(view);
        Populate_dashboardRV(view);

        return view;
    }
    private void Populate_storyRV(View view){

        storyRV = view.findViewById(R.id.story_rv);

        mStoryModelArrayList = new ArrayList<>();

        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Subash Karki"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Ramesh Rai"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Sanjay Ram"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Mina Kumar"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Sandy Mandy"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Milan Kumar"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Kumar Joshi"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Rupesh Sanduk"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Mahabir Pun"));
        mStoryModelArrayList.add(new StoryModel(R.drawable.ic_video,RandomImageURL()
                ,RandomImageURL(),"Punya Gautam"));

        StoryAdapter storyAdapter = new StoryAdapter(mStoryModelArrayList,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext()
                ,LinearLayoutManager.HORIZONTAL
                ,false);
        storyRV.setLayoutManager(linearLayoutManager);
        storyRV.setNestedScrollingEnabled(false);
        storyRV.setAdapter(storyAdapter);
    }
    private void Populate_dashboardRV(View view){

        dashboardRV = view.findViewById(R.id.dashboardRV);

        mDashboardModelArrayList = new ArrayList<>();

        mDashboardModelArrayList.add(new DashboardModel("Sanjay KC",RandomImageURL(),RandomImageURL()
                ,"Traveller",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Suraj BK",RandomImageURL(),RandomImageURL()
                ,"Influencer",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Subash Karki",RandomImageURL(),RandomImageURL()
                ,"Traveller",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Ram Bahadur",RandomImageURL(),RandomImageURL()
                ,"Programmar",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Meena Sunar",RandomImageURL(),RandomImageURL()
                ,"Designer",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Rupesh Rai",RandomImageURL(),RandomImageURL()
                ,"Carpenter",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("Sanjay KC",RandomImageURL(),RandomImageURL()
                ,"Traveller",543,223,332));

        DashboardAdapter dashboardAdapter = new DashboardAdapter(mDashboardModelArrayList,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext()
                ,LinearLayoutManager.VERTICAL
                ,false);
        dashboardRV.setLayoutManager(linearLayoutManager);
        dashboardRV.setNestedScrollingEnabled(false);
        dashboardRV.setAdapter(dashboardAdapter);
    }
    private String RandomImageURL(){
        String URL = "https://picsum.photos/500/300?random=" + String.valueOf(new Random().nextInt(1000));
        return URL;
    }
}