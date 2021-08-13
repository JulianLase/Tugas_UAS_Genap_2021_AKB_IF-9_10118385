package com.example.uas_akb;

//Tanggal   :09 Agustus 2021
//NIM       :10118385
//Nama      :Julian Arisky Lase
//Kelas     :IF9

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
                LatLng SanghyangHeuleut = new LatLng(-6.8765131,107.3400296);
                LatLng TebingKeraton = new LatLng( -6.8340683,107.6614264);
                LatLng Braga = new LatLng( -6.9181555,107.6046536);
                LatLng CurugTiluLeuwiOpat = new LatLng( -6.7910377,107.5798191);
                LatLng MuseumGeologiBandung = new LatLng( -6.9007162,107.6192666);
                LatLng FarmHouseSusuLembang = new LatLng( -6.832969,107.6034296);

                googleMap.addMarker(new MarkerOptions().position(SanghyangHeuleut).title("Sanghyang Heuleut"));
                googleMap.addMarker(new MarkerOptions().position(TebingKeraton).title("Tebing Keraton"));
                googleMap.addMarker(new MarkerOptions().position(Braga).title("Braga"));
                googleMap.addMarker(new MarkerOptions().position(CurugTiluLeuwiOpat).title("Curug Tilu Leuwi Opat"));
                googleMap.addMarker(new MarkerOptions().position(MuseumGeologiBandung).title("Museum Geologi Bandung"));
                googleMap.addMarker(new MarkerOptions().position(FarmHouseSusuLembang).title("FarmHouseSusuLembang"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Braga,11));

            }
        });
         return view;
    }
}