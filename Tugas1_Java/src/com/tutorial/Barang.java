package com.tutorial;

public class Barang {
  
  private String nama;
  private int stok, hrg_satuan, hrg, t_harga;

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public int getStok() {
    return stok;
  }

  public void setStok(int stok) {
    this.stok = stok;
  }

  public int getHrg_satuan() {
    return hrg_satuan;
  }

  public void setHrg_satuan(int hrg_satuan) {
    this.hrg_satuan = hrg_satuan;
  }

  public int getHrg() {
    return hrg;
  }

  public void setHrg(int stoc, int harga_satuan) {
    this.hrg = stok * hrg_satuan;
  }

  public int getT_harga() {
    return t_harga;
  }

  public void setT_harga(int t_harga) {
    this.t_harga = t_harga;
  }
}
