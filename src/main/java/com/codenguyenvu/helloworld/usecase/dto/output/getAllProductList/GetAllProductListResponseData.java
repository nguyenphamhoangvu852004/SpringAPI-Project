package com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList;

import com.codenguyenvu.helloworld.usecase.interfaces.ResponseData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllProductListResponseData implements ResponseData {
    private List<GetAllProductListHangHoaOutputDTO> list;

    public GetAllProductListResponseData(List<GetAllProductListHangHoaOutputDTO> list) {
        this.list = list;
    }

    public List<GetAllProductListHangHoaOutputDTO> getList() {
        return list;
    }

    public void setList(List<GetAllProductListHangHoaOutputDTO> list) {
        this.list = list;
    }
}
