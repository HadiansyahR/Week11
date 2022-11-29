package org.pojo;

public class Dokter {
    private Integer id;
    private String name;
    private String nama;
    private String jenisKelamin;
    private String departemen;
    private String nomorTelepon;
    private String alamat;

    private int umur;

    public Dokter() {
    }

    public Dokter(Integer id, Integer umur, String name, String nama, String jenisKelamin, String departemen, String nomorTelepon, String alamat) {
        this.setId(id);
        this.setUmur(umur);
        this.setName(name);
        this.setNama(nama);
        this.setJenisKelamin(jenisKelamin);
        this.setDepartemen(departemen);
        this.setNomorTelepon(nomorTelepon);
        this.setAlamat(alamat);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
