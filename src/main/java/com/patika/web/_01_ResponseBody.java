package com.patika.web;

// DAO = DATA ACCESS OBJECT
// DTO = DATA TRANSFER OBJECT

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class _01_ResponseBody {

    //1
    // http://localhost:3333/birinci
    @GetMapping("/birinci")
    @ResponseBody //Herhangi bir yerde görünmeyip direkt olarak ekranda görünmesini istediğim için yazdım
    public String birinciMethod(){
        return "Yükleniyor...";
    }

    //2
    // http://localhost:3333/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod(){
        return "index";
    }

    //3
    // http://localhost:3333/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod(){
        return "other/deneme";
    }

    //4
    // http://localhost:3333/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model){ //key-value yapısı ile çalışır
        model.addAttribute("param_key","Merhabalar Spring Model ile data geldi");
        return "param";
    }


}
