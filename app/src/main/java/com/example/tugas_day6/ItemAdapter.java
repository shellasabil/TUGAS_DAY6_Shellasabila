package com.example.tugas_day6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final ArrayList<Item> NamaItems;
    private final Context context;

    public ItemAdapter(ArrayList<Item> namaItems, Context context) {
        NamaItems = namaItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        final Item namaItem = NamaItems.get(position);
        holder.tv_Name.setText(namaItem.getName());
        holder.tv_Description.setText(namaItem.getDescription());
        holder.tv_Price.setText(namaItem.getPrice());
        holder.Image_view.setImageResource(namaItem.getImageItem());

        // Set click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click, for example, start detail activity
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("itemId", namaItem.getId()); // Pass item ID to detail activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return NamaItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_Name, tv_Description, tv_Price;
        ImageView Image_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_Name = itemView.findViewById(R.id.tv_namedetail);
            tv_Description = itemView.findViewById(R.id.tvdescription_detail);
            tv_Price = itemView.findViewById(R.id.tvPrice_detail);
            Image_view = itemView.findViewById(R.id.Imageview_detail);
        }
    }
}
