package com.example.uas_akb;

//Tanggal   :09 Agustus 2021
//NIM       :10118385
//Nama      :Julian Arisky Lase
//Kelas     :IF9

public class HomeModel {

    String nama,alamat,gambar,deskripsi;

    HomeModel()
    {

    }
    public HomeModel(String title, String alamat, String image, String deskripsi) {
        this.nama = nama;
        this.alamat = alamat;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
