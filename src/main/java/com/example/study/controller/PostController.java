package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // post가 쓰이는 경우
    // HTML <FORM>
    // ajax 검색
    // http post body -> data가 담김
    // json, xml, multiport-form / text_plain

    @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping("/postmethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

}
