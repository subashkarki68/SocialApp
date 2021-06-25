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
import com.ruchirajkarki.socialapp.models.SearchResultModel;

import java.util.ArrayList;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder>{
    ArrayList<SearchResultModel> mList;
    Context mContext;

    public SearchResultAdapter(ArrayList<SearchResultModel> list, Context context) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.search_result_rv_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchResultModel model = mList.get(position);
        holder.search_result_profile_name.setText(model.getSearch_result_profile_name());
        holder.search_result_profile_nickName.setText(model.getSearch_result_profile_nickName());
        Glide.with(holder.search_result_profile_image).load(model.getSearch_result_profile_image_URL()).into(holder.search_result_profile_image);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView search_result_profile_image;
        TextView search_result_profile_name, search_result_profile_nickName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            search_result_profile_image = itemView.findViewById(R.id.search_result_person_profile_image);
            search_result_profile_name = itemView.findViewById(R.id.search_result_person_name);
            search_result_profile_nickName = itemView.findViewById(R.id.search_result_person_nickname);
        }
    }
}
