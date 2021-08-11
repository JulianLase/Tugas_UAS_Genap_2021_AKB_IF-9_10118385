package com.example.uas_akb;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class LocationFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_location, container, false);

        //Initialize map fragment
         SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_maps);

        //Async map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng bandung = new LatLng(-6.9179232,107.6096949);
                LatLng DusunBambu = new LatLng( -6.7894762,107.5766398);
                LatLng TebingKeraton = new LatLng( -6.8340683,107.6614264);

                googleMap.addMarker(new MarkerOptions().position(bandung).title("bandung"));
                googleMap.addMarker(new MarkerOptions().position(DusunBambu).title("Dusun Bambu"));
                googleMap.addMarker(new MarkerOptions().position(TebingKeraton).title("Tebing Keraton"));

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bandung,10));

            }
        });
         return view;
    }
}