package com.example.uas_akb;

//Tanggal   :09 Agustus 2021
//NIM       :10118385
//Nama      :Julian Arisky Lase
//Kelas     :IF9

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    HomeAdapter homeAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<HomeModel> options =
                new FirebaseRecyclerOptions.Builder<HomeModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Daftar_Wisata"), HomeModel.class)
                        .build();

        homeAdapter = new HomeAdapter(options);
        recyclerView.setAdapter(homeAdapter);

        return view;

    }
    @Override
    public void onStart() {
        super.onStart();
        homeAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        homeAdapter.stopListening();
    }
}