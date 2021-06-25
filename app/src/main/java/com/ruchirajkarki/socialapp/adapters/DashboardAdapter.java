package com.ruchirajkarki.socialapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ruchirajkarki.socialapp.R;
import com.ruchirajkarki.socialapp.models.DashboardModel;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ViewHolder> {
    ArrayList<DashboardModel> mList;
    Context mContext;

    public DashboardAdapter(ArrayList<DashboardModel> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dashboard_rv_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  DashboardAdapter.ViewHolder holder, int position) {
        DashboardModel model = mList.get(position);
        holder.dashboard_others_name.setText(model.getDashboard_poster_name());
        holder.dashboard_others_about.setText(model.getDashboard_poster_about());
        holder.dashboard_favourite_count.setText(String.valueOf(model.getDashboard_favourite_count()));
        holder.dashboard_comment_count.setText(String.valueOf(model.getDashboard_comment_count()));
        holder.dashboard_share_count.setText(String.valueOf(model.getDashboard_share_count()));
        Glide.with(holder.dashboard_others_profile_image).load(model.getDashboard_poster_profile_image_URL()).into(holder.dashboard_others_profile_image);
        Glide.with(holder.dashboard_post_image).load(model.getDashboard_poster_post_image_URL()).into(holder.dashboard_post_image);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView dashboard_others_profile_image, dashboard_post_image;
        TextView dashboard_others_about, dashboard_others_name, dashboard_favourite_count, dashboard_comment_count, dashboard_share_count;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dashboard_others_profile_image = itemView.findViewById(R.id.dashboard_others_profile_image);
            dashboard_post_image = itemView.findViewById(R.id.dashboard_post_image);
            dashboard_others_about = itemView.findViewById(R.id.dashboard_others_about);
            dashboard_others_name = itemView.findViewById(R.id.dashboard_others_name);
            dashboard_favourite_count = itemView.findViewById(R.id.favourite_ic);
            dashboard_comment_count = itemView.findViewById(R.id.comment_ic);
            dashboard_share_count = itemView.findViewById(R.id.share_ic);
        }
    }
}
