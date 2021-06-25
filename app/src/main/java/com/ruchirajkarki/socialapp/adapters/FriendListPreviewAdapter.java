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
import com.ruchirajkarki.socialapp.models.FriendListPreviewModel;

import java.util.ArrayList;

public class FriendListPreviewAdapter extends RecyclerView.Adapter<FriendListPreviewAdapter.ViewHolder>{
    Context mContext;
    ArrayList<FriendListPreviewModel> mFriendListPreviewModels;

    public FriendListPreviewAdapter(Context context, ArrayList<FriendListPreviewModel> friendListPreviewModels) {
        mContext = context;
        mFriendListPreviewModels = friendListPreviewModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.friendlist_preview_rv_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FriendListPreviewModel model = mFriendListPreviewModels.get(position);
        holder.friend_profile_name.setText(model.getFriend_profile_name());
        Glide.with(holder.friend_profile_image).load(model.getFriend_profile_image_URL()).into(holder.friend_profile_image);
    }

    @Override
    public int getItemCount() {
        return mFriendListPreviewModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView friend_profile_image;
        TextView friend_profile_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            friend_profile_image = itemView.findViewById(R.id.friendlist_preview_friend_profile_image);
            friend_profile_name = itemView.findViewById(R.id.friendlist_preview_friend_profile_name);

        }
    }
}
