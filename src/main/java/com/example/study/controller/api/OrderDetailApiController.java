package com.example.study.controller.api;

import com.example.study.controller.CrudController;
import com.example.study.model.entity.OrderDetail;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.OrderDetailApiRequest;
import com.example.study.model.network.response.OrderDetailApiResponse;
import com.example.study.service.OrderDetailApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/orderDetail")
public class OrderDetailApiController extends CrudController<OrderDetailApiRequest, OrderDetailApiResponse, OrderDetail> {
    @Autowired
    private OrderDetailApiLogicService orderDetailApiLogicService;

    @GetMapping
    public Header<List<OrderDetailApiResponse>> search(@PageableDefault(sort = "id") Pageable pageable){
        return orderDetailApiLogicService.search(pageable);
    }
}