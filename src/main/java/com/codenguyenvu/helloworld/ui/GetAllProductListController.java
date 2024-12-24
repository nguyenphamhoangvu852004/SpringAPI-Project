package com.codenguyenvu.helloworld.ui;

import com.codenguyenvu.helloworld.usecase.interfaces.InputBoundary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllProductListController {
    private InputBoundary getAllProductListUseCase;
    private GetAllProductListPresenter getAllProductListPresenter;

    @Autowired
    public GetAllProductListController(InputBoundary getAllProductListUseCase,GetAllProductListPresenter getAllProductListPresenter) {
        this.getAllProductListUseCase = getAllProductListUseCase;
        this.getAllProductListPresenter = getAllProductListPresenter;
    }

    @GetMapping("/hello")
    public GetAllProductListViewModel hello() {
        getAllProductListUseCase.execute(null);
        return getAllProductListPresenter.getGetAllProductListViewModel();
    }

}
