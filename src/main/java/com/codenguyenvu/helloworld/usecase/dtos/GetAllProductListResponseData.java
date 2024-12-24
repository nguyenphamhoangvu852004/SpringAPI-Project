package com.codenguyenvu.helloworld.usecase.dtos;

import com.codenguyenvu.helloworld.usecase.interfaces.ResponseData;

import java.util.List;

public class GetAllProductListResponseData implements ResponseData {
    private List<GetAllProductListOutputDTO> listResponseData;

    public GetAllProductListResponseData(List<GetAllProductListOutputDTO> listResponseData) {
        this.listResponseData = listResponseData;
    }

    public List<GetAllProductListOutputDTO> getListResponseData() {
        return listResponseData;
    }
}
