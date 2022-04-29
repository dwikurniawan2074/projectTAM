package com.example.scholaps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.BeasiswaViewHolder> {

    private ArrayList<Beasiswa> listBeasiswa;

    public Adapter(ArrayList<Beasiswa> listBeasiswa) {
        this.listBeasiswa = listBeasiswa;
    }

    @NonNull
    @Override
    public BeasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.add_item,parent,false);
        return new BeasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeasiswaViewHolder holder, int position) {
        holder.imageView.setImageResource(listBeasiswa.get(position).getImageview());
        holder.tvnamaBeasiswa.setText(listBeasiswa.get(position).getNamaBeasiswa());
        holder.tvPenyedia.setText(listBeasiswa.get(position).getPenyedia());
        holder.tvJenjang.setText(listBeasiswa.get(position).getJenjang());

    }

    @Override
    public int getItemCount() {
        return (listBeasiswa != null ? listBeasiswa.size() : 0);
    }

    public class BeasiswaViewHolder extends RecyclerView.ViewHolder{

        private TextView tvnamaBeasiswa, tvPenyedia, tvJenjang;
        private ImageView imageView;

        public BeasiswaViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.img_item_photo);
            tvnamaBeasiswa = view.findViewById(R.id.tv_namaBeasiswa);
            tvPenyedia = view.findViewById(R.id.tv_penyedia);
            tvJenjang = view.findViewById(R.id.tv_jenjang);

        }
    }
}
