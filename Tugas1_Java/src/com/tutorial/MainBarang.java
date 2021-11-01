package com.tutorial;

public class MainBarang {
    public static void main(String[] args)
    {
        int t_harga;

        MainBarang Barang1 = new MainBarang();
        Barang1.setNama("Buku");
        Barang1.setStok(15);
        Barang1.setHrg_satuan(4000);
        Barang1.setHrg(15, 4000);
        int a=Barang1.getHrg();

        var  Barang2 = new MainBarang();
        Barang2.setNama("Buku Hutang");
        Barang2.setStok(10);
        Barang2.setH_satuan(3000);
        Barang2.setH(10, 3000);
        int b=Barang2.getHarga();
   
        MainBarang Barang3 = new MainBarang();
        Barang3.setNama("Penghapus");
        Barang3.setStoc(10);
        Barang3.setHarga_satuan(500);
        Barang3.setHarga(10, 500);
        int c=Barang3.getHarga();

        System.out.println("\nNama Alat Tulis = " +Barang1.getNama());
        System.out.println("Stoc            = " +Barang1.getStoc());
        System.out.println("Harga Satuan    = Rp. " +Barang1.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang1.getHarga());

        System.out.println("\nNama Alat Tulis = " +Barang2.getNama());
        System.out.println("Stoc            = " +Barang2.getStoc());
        System.out.println("Harga Satuan    = Rp. " +Barang2.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang2.getHarga());

        System.out.println("\nNama Alat Tulis = " +Barang3.getNama());
        System.out.println("Stoc            = " +Barang3.getStoc());
        System.out.println("Harga Satuan    = Rp. " +Barang3.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang3.getHarga());

        t_harga = a+b+c;
        System.out.println("\nTotal Harga     = Rp. " +t_harga);
    }

    private String getHarga_satuan() {
        return null;
    }

    private String getStoc() {
        return null;
    }

    private String getNama() {
        return null;
    }

    private void setHarga(int i, int j) {
    }

    private void setHarga_satuan(int i) {
    }

    private void setStoc(int i) {
    }

    private int getHarga() {
        return 0;
    }

    private void setH(int i, int j) {
    }

    private void setH_satuan(int i) {
    }

    private int getHrg() {
        return 0;
    }

    private void setHrg_satuan(int i) {
    }

    private void setHrg(int i, int j) {
    }

    private void setNama(String string) {
    }

    private void setStok(int i) {
    }
}