package com.codenguyenvu.helloworld.usecase.dto.input.getAllProductList;

import com.codenguyenvu.helloworld.usecase.interfaces.RequestData;
import org.springframework.stereotype.Component;

@Component
public class GetAllProductListRequestData implements RequestData {
    private GetAllProductListInputDTO getAllProductListInputDTO;

    public GetAllProductListRequestData(GetAllProductListInputDTO getAllProductListInputDTO) {
        this.getAllProductListInputDTO = getAllProductListInputDTO;
    }

    public GetAllProductListInputDTO getGetAllProductListInputDTO() {
        return getAllProductListInputDTO;
    }

    public void setGetAllProductListInputDTO(GetAllProductListInputDTO getAllProductListInputDTO) {
        this.getAllProductListInputDTO = getAllProductListInputDTO;
    }
}
