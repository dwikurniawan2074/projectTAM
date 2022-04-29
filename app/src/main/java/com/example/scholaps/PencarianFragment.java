package com.example.scholaps;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import java.util.ArrayList;

public class PencarianFragment extends Fragment {

    private RecyclerView recyclerView;
    private com.example.scholaps.Adapter adapter;
    private ArrayList<Beasiswa> beasiswaArrayList;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_pencarian, container, false);
        getData();
        recyclerView = view.findViewById(R.id.recyclerview);
        adapter = new Adapter(beasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return view;
    }

    public void getData(){
        beasiswaArrayList = new ArrayList<>();
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Djarum Foundation","Djarum.corp","Sarjana, Magister, Doktor"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Lazada Forward","Lazada Indonesia","Sarjana"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"AMINEF (America Indonesian Exchange Foundaation)","AMINEF","Diploma, Sarjana"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Sariraya Japan 2022","Sariraya Co., Ltd.","Diploma, Sarjana"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Beasiswa JIS","Jakarta Intercultural School","Pelajar SMA"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Beasiswa Brunei Darussalam","Pemerintah Brunei","Diploma, Sarjana, Magister"));
        beasiswaArrayList.add(new Beasiswa(R.drawable.ic_beasiswa,"Mitsui Bussan Scholarship","Mitsui Co & Ltd","Sarjana"));

    }
}