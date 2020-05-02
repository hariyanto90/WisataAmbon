package com.dicoding.wisataambon.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.wisataambon.R;
import com.dicoding.wisataambon.model.Tour;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListTourAdapter extends RecyclerView.Adapter<ListTourAdapter.ListViewHolder> {
    private ArrayList<Tour> listTour;
    private OnItemClickCallback onItemClickCallback;
    private Context context;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListTourAdapter(ArrayList<Tour> list) {
        this.listTour = list;
    }

    ListTourAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_tour, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {


        Tour tour = listTour.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tour.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);


        holder.tvName.setText(tour.getName());
        holder.tvDetail.setText(tour.getDetail());
        holder.tvLocation.setText(tour.getLocation());



        // untuk membuat 1 Activity untuk semua listview
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        onItemClickCallback.onItemClicked(listTour.get(holder.getAdapterPosition()));

            }
        });


    }



    @Override
    public int getItemCount() {
        return listTour.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto, mImage, imgIcon, mIcon;
        TextView tvName, tvDetail, mNama, mEmail, tvLocation;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            imgIcon = itemView.findViewById(R.id.img_icon);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvLocation = itemView.findViewById(R.id.tv_location);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            mImage =itemView.findViewById(R.id.image);
            mNama = itemView.findViewById(R.id.nama);
            mEmail = itemView.findViewById(R.id.nama_email);
            mIcon = itemView.findViewById(R.id.icon_email);





            }


        }
    public interface OnItemClickCallback {
        void onItemClicked(Tour data);
    }
}




