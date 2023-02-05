package com.juaracoding.selspringbootf.model;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/5/2023 4:50 PM
@Last Modified 2/5/2023 4:50 PM
Version 1.1
*/
public class Welcome {

    private  String nama;
    private String alamat;
    private String jenisKelamin;

    private InerWelcome inerWelcome;

    public InerWelcome getInerWelcome() {
        return inerWelcome;
    }

    public void setInerWelcome(InerWelcome inerWelcome) {
        this.inerWelcome = inerWelcome;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
