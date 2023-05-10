package com.vaibhavmojidra.androidjavademo2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TVAdapter extends RecyclerView.Adapter<TVAdapter.TvRecyclerViewHolder> {

    private List<TV> tvList;
    private TVItemClickListenerInterface tvItemClickListenerInterface;

    public TVAdapter(List<TV> tvList, TVItemClickListenerInterface tvItemClickListenerInterface) {
        this.tvList = tvList;
        this.tvItemClickListenerInterface = tvItemClickListenerInterface;
    }

    @NonNull
    @Override
    public TvRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TvRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TvRecyclerViewHolder holder, int position) {
        holder.bind(tvList.get(position),tvItemClickListenerInterface);
    }

    @Override
    public int getItemCount() {
        return tvList.size();
    }

    class TvRecyclerViewHolder extends RecyclerView.ViewHolder{

        public TvRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(TV tv,TVItemClickListenerInterface itemClickListenerInterface){
            TextView textView=itemView.findViewById(R.id.tv_name);
            textView.setText(tv.getName());
            itemView.setOnClickListener(view -> itemClickListenerInterface.onItemClick(tv));
        }
    }
}
