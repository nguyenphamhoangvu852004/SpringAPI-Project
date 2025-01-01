package com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList;

public class GetAllProductListHangHoaOutputDTO {
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;
    private String maLoai;
    private String tenLoai;

    public GetAllProductListHangHoaOutputDTO() {

    }
    public GetAllProductListHangHoaOutputDTO(String maHang, String tenHang, int soLuongTon, double donGia, String maLoai, String tenLoai) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
