package com.patika.web;

// DAO = DATA ACCESS OBJECT
// DTO = DATA TRANSFER OBJECT

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class _01_ResponseBody {

    @GetMapping("/birinci")
    @ResponseBody //Herhangi bir yerde görünmeyip direkt olarak ekranda görünmesini istediğim için yazdım
    public String birinciMethod(){
        return "Yükleniyor...";
    }
}
