package com.example.study.controller;

import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import jdk.javadoc.internal.doclets.formats.html.markup.Head;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {


    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi GetMethod";
    }

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&pwd=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "pwd") String password){
                                                                    // name을 pwd로 설정해주면 주소 상의 파라미터도 pwd여야 함 변수이름인 password 안됨
        System.out.println("id : " +id);
        System.out.println("password : " + password);

        return id+password;
    }

    //localhost:8080/api/multiParameter?account=abdc&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //Spring 에서는 객체를 리턴하면 json형태로 바꿔준다
        return searchParam;
    }

    @GetMapping("/header")
    public Header getHeader(){
        return Header.builder().resultCode("Ok").description("OK").build();
    }

}
