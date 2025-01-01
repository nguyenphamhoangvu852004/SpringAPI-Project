package com.codenguyenvu.helloworld.ui.presenter;

import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListHangHoaOutputDTO;
import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListResponseData;
import com.codenguyenvu.helloworld.usecase.interfaces.OutputBoundary;
import com.codenguyenvu.helloworld.usecase.interfaces.ResponseData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GettAllProductListPresenter implements OutputBoundary {
    GetAllProductListResponseData getAllProductListResponseData;
    List<GetAllProductListHangHoaOutputDTO> list = null;
    public GettAllProductListPresenter(GetAllProductListResponseData getAllProductListResponseData) {
        this.getAllProductListResponseData = getAllProductListResponseData;
    }

    @Override
    public void exportData(ResponseData responseData) {
        getAllProductListResponseData = (GetAllProductListResponseData) responseData;
        list = getAllProductListResponseData.getList();
    }

    public GetAllProductListResponseData getGetAllProductListResponseData() {
        return getAllProductListResponseData;
    }

    public List<GetAllProductListHangHoaOutputDTO> getList() {
        return list;
    }
}
