package com.codenguyenvu.helloworld.ui.controller;

import com.codenguyenvu.helloworld.database.HangHoaDAO;
import com.codenguyenvu.helloworld.ui.presenter.GettAllProductListPresenter;
import com.codenguyenvu.helloworld.usecase.GetAllProductUseCase;
import com.codenguyenvu.helloworld.usecase.dto.input.getAllProductList.GetAllProductListInputDTO;
import com.codenguyenvu.helloworld.usecase.dto.input.getAllProductList.GetAllProductListRequestData;
import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListHangHoaOutputDTO;
import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListResponseData;
import com.codenguyenvu.helloworld.usecase.entity.HangHoa;
import com.codenguyenvu.helloworld.usecase.interfaces.InputBoundary;
import com.codenguyenvu.helloworld.usecase.interfaces.OutputBoundary;
import com.codenguyenvu.helloworld.usecase.interfaces.RequestData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllProductListController {
    InputBoundary inputBoundary;
    OutputBoundary outputBoundary;

    public GetAllProductListController(GetAllProductUseCase inputBoundary, GettAllProductListPresenter outputBoundary) {
        this.inputBoundary = inputBoundary;
        this.outputBoundary = outputBoundary;
    }

    @GetMapping("/getallproductlist")
    public List<GetAllProductListHangHoaOutputDTO> execute() {
        GetAllProductListInputDTO getAllProductListInputDTO= new GetAllProductListInputDTO();
        RequestData requestData = new GetAllProductListRequestData(getAllProductListInputDTO);
        inputBoundary.execute(requestData);
        return ((GettAllProductListPresenter) outputBoundary).getList();
    }

}
