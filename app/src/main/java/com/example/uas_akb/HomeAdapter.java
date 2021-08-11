package com.example.uas_akb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.annotations.NotNull;

public class HomeAdapter extends FirebaseRecyclerAdapter<HomeModel,HomeAdapter.myViewHolder> {


    //Tanggal   :04 Juni 2021
    //NIM       :10118385
    //Nama      :Julian Arisky Lase
    //Kelas     :IF9

    public HomeAdapter(@NonNull FirebaseRecyclerOptions<HomeModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull HomeModel model) {
        holder.title.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());
        holder.deskripsi.setText(model.getDeskripsi());

        Glide.with(holder.img.getContext())
                .load(model.getGambar())
                .placeholder(R.drawable.common_google_signin_btn_icon_dark)
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView img;
        TextView title, alamat, deskripsi;

        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            img = (ShapeableImageView) itemView.findViewById(R.id.image_data);
            title = (TextView) itemView.findViewById(R.id.title_data);
            alamat = (TextView) itemView.findViewById(R.id.alamat_data);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi_data);
        }
    }

}