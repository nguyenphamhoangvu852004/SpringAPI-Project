package com.codenguyenvu.helloworld.usecase.dtos;


public class GetAllProductListOutputDTO{
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;
    private String maLoai;

    public GetAllProductListOutputDTO(
            String maHang, String tenHang, int soLuongTon, double donGia, String maLoai
    ) {
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
}
