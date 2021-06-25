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
import com.ruchirajkarki.socialapp.models.StoryModel;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

    ArrayList<StoryModel> mList;
    Context mContext;

    public StoryAdapter(ArrayList<StoryModel> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.story_rv_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  StoryAdapter.ViewHolder holder, int position) {
        StoryModel model = mList.get(position);
//        holder.others_story_image.setImageResource(model.getOthers_story_image());
//        holder.others_profile_image.setImageResource(model.getOthers_profile_image());
//        holder.story_type.setImageResource(model.getStory_type());
        holder.others_name.setText(model.getOthers_name());
        Glide.with(holder.others_profile_image).load(model.getOthers_profile_image_URL()).into(holder.others_profile_image);
        Glide.with(holder.others_story_image).load(model.getOthers_story_image_URL()).into(holder.others_story_image);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView others_story_image, story_type, others_profile_image;
        TextView others_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            others_story_image = itemView.findViewById(R.id.others_story_image);
            story_type = itemView.findViewById(R.id.story_type_image_view);
            others_profile_image = itemView.findViewById(R.id.others_profile_image);
            others_name = itemView.findViewById(R.id.others_name_text_view);
        }
    }
}
