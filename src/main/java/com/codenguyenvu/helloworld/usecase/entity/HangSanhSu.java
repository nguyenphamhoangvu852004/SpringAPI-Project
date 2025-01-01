package com.codenguyenvu.helloworld.usecase.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hang_sanh_su")
public class HangSanhSu extends HangHoa  {
    @Column(name = "nha_san_xuat")
    private String nhaSanXuat;

    @Column(name = "ngay_san_xuat")
    private Date ngayNhapKho;
    public HangSanhSu() {
    }
    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
    
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public String toString() {
        return "HangSanhSu [nhaSanXuat=" + nhaSanXuat + ", ngayNhapKho=" + ngayNhapKho + ", maHang=" + maHang
                + ", tenHang=" + tenHang + ", soLuongTon=" + soLuongTon + ", donGia=" + donGia + ", loaiHang="
                + loaiHang + "]";
    }
    
}
