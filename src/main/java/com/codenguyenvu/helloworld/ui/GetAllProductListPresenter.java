package com.codenguyenvu.helloworld.ui;

import com.codenguyenvu.helloworld.usecase.dtos.GetAllProductListOutputDTO;
import com.codenguyenvu.helloworld.usecase.dtos.GetAllProductListResponseData;
import com.codenguyenvu.helloworld.usecase.interfaces.OutputBoundary;
import com.codenguyenvu.helloworld.usecase.interfaces.ResponseData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllProductListPresenter implements OutputBoundary {
    private GetAllProductListViewModel getAllProductListViewModel;
    @Override
    public void exportData(ResponseData responseData) {
        GetAllProductListResponseData getAllProductListResponseData = (GetAllProductListResponseData) responseData;
        List<GetAllProductListOutputDTO> list = getAllProductListResponseData.getListResponseData();
        for (GetAllProductListOutputDTO item : list) {
            getAllProductListViewModel.setMaHang(item.getMaHang());
            getAllProductListViewModel.setTenHang(item.getTenHang());
            String.valueOf(item.getSoLuongTon());
            String.valueOf(item.getDonGia());
            getAllProductListViewModel.setMaLoai(item.getMaLoai());
        }
    }

    public GetAllProductListViewModel getGetAllProductListViewModel() {
        return getAllProductListViewModel;
    }
}
