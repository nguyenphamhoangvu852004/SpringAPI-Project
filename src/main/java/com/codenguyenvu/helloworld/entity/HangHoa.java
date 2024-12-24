package com.codenguyenvu.helloworld.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hang_hoa")
public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;
    protected String maLoai;

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia, String maLoai) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.maLoai = maLoai;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getMaLoai() {
        return maLoai;
    }

    protected abstract double tinhVat();

}
