package com.example.scholaps;

public class Beasiswa {
    private int imageview;
    private String namaBeasiswa;
    private String penyedia;
    private String jenjang;

    public Beasiswa(int imageview, String namaBeasiswa, String penyedia, String jenjang) {
        this.imageview = imageview;
        this.namaBeasiswa = namaBeasiswa;
        this.penyedia = penyedia;
        this.jenjang = jenjang;
    }

    public int getImageview() {
        return imageview;
    }

    public String getNamaBeasiswa() {return namaBeasiswa;}

    public String getPenyedia() {
        return penyedia;
    }

    public String getJenjang() {
        return jenjang;
    }
}
