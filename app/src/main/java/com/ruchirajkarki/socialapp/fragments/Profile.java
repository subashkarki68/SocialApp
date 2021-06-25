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
import com.ruchirajkarki.socialapp.adapters.FriendListPreviewAdapter;
import com.ruchirajkarki.socialapp.models.DashboardModel;
import com.ruchirajkarki.socialapp.models.FriendListPreviewModel;

import java.util.ArrayList;
import java.util.Random;

public class Profile extends Fragment {
    RecyclerView friendlist_preview_rv, my_posts_rv;
    ArrayList<FriendListPreviewModel> mFriendListPreviewModels;
    ArrayList<DashboardModel> mDashboardModelArrayList;
    public Profile() {
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
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        populateFriendlistPreviewRV(view);
        populateMyPostsRV(view);
        return view;
    }
    private void populateFriendlistPreviewRV(View view){
        friendlist_preview_rv = view.findViewById(R.id.friendlist_preview_rv);
        mFriendListPreviewModels = new ArrayList<>();

        mFriendListPreviewModels.add(new FriendListPreviewModel("Ram Bahadur", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Sass Bahadur", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Uioppp Papn", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Pallu Lomani", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Jhaplu Paplu", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Sujna Singh", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("KP Sharma Oli is a hero, i dont think so. This is long", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Komal Oli", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Sandy Tupo", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Munda Sunda", randomImageURL()));
        mFriendListPreviewModels.add(new FriendListPreviewModel("Man Maran", randomImageURL()));

        FriendListPreviewAdapter friendListPreviewAdapter = new FriendListPreviewAdapter(getContext(),mFriendListPreviewModels);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        friendlist_preview_rv.setLayoutManager(linearLayoutManager);
        friendlist_preview_rv.setNestedScrollingEnabled(false);
        friendlist_preview_rv.setAdapter(friendListPreviewAdapter);

    }

    private void populateMyPostsRV(View view){
        my_posts_rv = view.findViewById(R.id.my_posts_dashboard_rv);
        mDashboardModelArrayList = new ArrayList<>();

        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Traveller",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Influencer",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Traveller",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Programmar",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Designer",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Carpenter",543,223,332));
        mDashboardModelArrayList.add(new DashboardModel("My name", randomImageURL(), randomImageURL()
                ,"Traveller",543,223,332));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        DashboardAdapter dashboardAdapter = new DashboardAdapter(mDashboardModelArrayList,getContext());
        my_posts_rv.setLayoutManager(linearLayoutManager);
        my_posts_rv.setNestedScrollingEnabled(false);
        my_posts_rv.setAdapter(dashboardAdapter);

    }

    private String randomImageURL(){
        String URL = "https://picsum.photos/500/300?random=" + String.valueOf(new Random().nextInt(1000));
        return URL;
    }
}