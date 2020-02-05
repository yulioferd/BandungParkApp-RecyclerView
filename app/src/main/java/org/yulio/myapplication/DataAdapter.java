package org.yulio.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    private Context mContext;
    private ArrayList<DataClass> dataClassArrayList;

    public DataAdapter(Context mContext, ArrayList<DataClass> dataClassArrayList) {
        this.mContext = mContext;
        this.dataClassArrayList = dataClassArrayList;
    }
    private DataViewHolder.OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(DataViewHolder.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public DataAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataAdapter.DataViewHolder holder, int position) {
        DataClass dataClass = dataClassArrayList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(dataClass.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.iv_park);
        holder.tv_title.setText(dataClass.getTitle());
        holder.tv_description.setText(dataClass.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(dataClassArrayList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataClassArrayList.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_park;
        TextView tv_title, tv_description;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_park = itemView.findViewById(R.id.imageView);
            tv_title =itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_descripstion);
        }
        public interface OnItemClickCallback{
            void onItemClicked(DataClass dataClass);
        }
    }
}
