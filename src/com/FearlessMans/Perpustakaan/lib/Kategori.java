/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FearlessMans.Perpustakaan.lib;

/**
 *
 * @author khosy
 */
public class Kategori {
    private int id;
    private String namaKategori;

    public Kategori(String namaKategori, int id) {
        this.namaKategori = namaKategori;
        this.id = id;  
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public int getId() {
        return id;
    }

    public String getNamaKategori() {
        return namaKategori;
    }
    
    @Override
    public String toString() {
        return this.namaKategori;
    }
    
}
