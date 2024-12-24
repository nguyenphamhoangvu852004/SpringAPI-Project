package com.codenguyenvu.helloworld.usecase.services;

import com.codenguyenvu.helloworld.database.GetAllProductListMysql;
import com.codenguyenvu.helloworld.entity.HangDienMay;
import com.codenguyenvu.helloworld.entity.HangHoa;
import com.codenguyenvu.helloworld.entity.HangSanhSu;
import com.codenguyenvu.helloworld.entity.HangThucPham;
import com.codenguyenvu.helloworld.ui.GetAllProductListPresenter;
import com.codenguyenvu.helloworld.usecase.dtos.GetAllProductListOutputDTO;
import com.codenguyenvu.helloworld.usecase.dtos.GetAllProductListResponseData;
import com.codenguyenvu.helloworld.usecase.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllProductListUseCase implements InputBoundary {
    private DatabaseBoundary databaseBoundary;
    private OutputBoundary outputBoundary;
    private ResponseData responseData;
    @Autowired
    public GetAllProductListUseCase(GetAllProductListMysql databaseBoundary, GetAllProductListPresenter outputBoundary) {
        this.databaseBoundary = databaseBoundary;
        this.outputBoundary = outputBoundary;
    }

    @Override
    public void execute(RequestData requestData) {
        List<HangHoa> hangHoaList = ((GetAllProductListMysql)databaseBoundary).getAllProductList();
        System.out.println(hangHoaList);
        List<GetAllProductListOutputDTO> listOutputDTOS = new ArrayList<>();

//        for (HangHoa hangHoa : hangHoaList) {
//            if (hangHoa instanceof HangDienMay){
//                HangHoa hangDienMay = new HangDienMay(hangHoa.getMaHang(),hangHoa.getTenHang(),hangHoa.getSoLuongTon(),hangHoa.getDonGia(),hangHoa.getMaLoai(),hangHoa.getThoiGianBaoHanh(),hangHoa.getCongSuat());
//                listOutputDTOS.add(new GetAllProductListOutputDTO(hangDienMay.getMaHang(),hangDienMay.getTenHang(),hangDienMay.getSoLuongTon(),hangDienMay.getDonGia(),hangDienMay.getMaLoai()));
//            }
//            if (hangHoa instanceof HangSanhSu) {
//                HangHoa hangSanhSu = new HangSanhSu(hangHoa.getMaHang(), hangHoa.getTenHang(), hangHoa.getSoLuongTon(), hangHoa.getDonGia(), hangHoa.getMaLoai(), ((HangSanhSu) hangHoa).getNhaSanXuat(), ((HangSanhSu) hangHoa).getNgayNhapKho(), ((HangSanhSu) hangHoa).getNhaCungCap());
//                listOutputDTOS.add(new GetAllProductListOutputDTO(hangSanhSu.getMaHang(), hangSanhSu.getTenHang(), hangSanhSu.getSoLuongTon(), hangSanhSu.getDonGia(), hangSanhSu.getMaLoai()));
//            }
//            if (hangHoa instanceof HangThucPham){
//                HangHoa hangThucPham = new HangThucPham(hangHoa.getMaHang(),hangHoa.getTenHang(),hangHoa.getSoLuongTon(),hangHoa.getDonGia(),hangHoa.getMaLoai(),((HangThucPham) hangHoa).getNgaySanXuat(),((HangThucPham) hangHoa).getNgayHetHan(),((HangThucPham) hangHoa).getNhaCungCap());
//                listOutputDTOS.add(new GetAllProductListOutputDTO(hangThucPham.getMaHang(),hangThucPham.getTenHang(),hangThucPham.getSoLuongTon(),hangThucPham.getDonGia(),hangThucPham.getMaLoai()));
//            }
//        }
//
        ResponseData responseData = new GetAllProductListResponseData(listOutputDTOS);
        outputBoundary.exportData(responseData);
    }

    public ResponseData getResponseData() {
        return this.responseData;
    }
}
