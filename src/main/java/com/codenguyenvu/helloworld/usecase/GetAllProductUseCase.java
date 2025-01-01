package com.codenguyenvu.helloworld.usecase;

import com.codenguyenvu.helloworld.database.GetAllProductDatabase;
import com.codenguyenvu.helloworld.ui.presenter.GettAllProductListPresenter;
import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListHangHoaOutputDTO;
import com.codenguyenvu.helloworld.usecase.dto.output.getAllProductList.GetAllProductListResponseData;
import com.codenguyenvu.helloworld.usecase.entity.HangHoa;
import com.codenguyenvu.helloworld.usecase.interfaces.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllProductUseCase implements InputBoundary {
    private DatabaseBoundary databaseBoundary;
    private OutputBoundary outputBoundary;

    public GetAllProductUseCase(DatabaseBoundary databaseBoundary, OutputBoundary outputBoundary) {
        this.databaseBoundary = databaseBoundary;
        this.outputBoundary = outputBoundary;
    }

    @Override
    public void execute(RequestData requestData) {
        List<HangHoa> hangHoaList = ((GetAllProductDatabase) databaseBoundary).getAll();

        List<GetAllProductListHangHoaOutputDTO> list = new ArrayList<>();
        for (HangHoa hangHoa : hangHoaList) {
            GetAllProductListHangHoaOutputDTO hangHoaOutputDTO = new GetAllProductListHangHoaOutputDTO(hangHoa.getMaHang(), hangHoa.getTenHang(), hangHoa.getSoLuongTon(), hangHoa.getDonGia(), hangHoa.getLoaiHang().getMaLoai(),hangHoa.getLoaiHang().getTenLoai());
            list.add(hangHoaOutputDTO);
        }

        ResponseData r = new GetAllProductListResponseData(list);
        outputBoundary.exportData(r);
    }
}
