package com.codenguyenvu.helloworld.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
public class HangSanhSu extends HangHoa {

    @Column(name = "nhaSanXuat")
    private String nhaSanXuat;

    @Column(name = "ngayNhapKho")
    private Date ngayNhapKho;

    // getters and setters
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
}
