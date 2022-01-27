package com.patika.web;

// DAO = DATA ACCESS OBJECT
// DTO = DATA TRANSFER OBJECT

import com.patika.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    /////////////////////////////////////// PathVariable /////////////////////////////////

    //5
    // http://localhost:3333/besinci/55
    @GetMapping("besinci/{param1}")
    public String besinciMethod(Model model,@PathVariable(name = "param1") int sayi){
        model.addAttribute("param_key","Merhabalar " + sayi);
        return "pathvariable";
    }

    //6
    // http://localhost:3333/altinci/55
    @GetMapping( {"/altinci/{param1}", "/altinci"} ) //Opsiyonel Yapı Olusturduk
    public String altinciMethod(Model model, @PathVariable(name = "param1", required = false ) Integer sayi){ //required default truedir
        model.addAttribute("param_key", "Data " + sayi);                          //Opsiyonel olması için kapadım
        return "pathvariable";
    }

    //7 //Kullanıcıya null göstermemek için önlem aldık
    // http://localhost:3333/altinci/55
    @GetMapping( {"/yedinci/{param1}", "/yedinci"} ) //Opsiyonel Yapı Olusturduk
    public String yedinciMethod(Model model, @PathVariable(name = "param1", required = false ) Integer sayi){
        if(sayi != null){
            model.addAttribute("param_key", "Data " + sayi);
        }else{
            model.addAttribute("param_key", "Data ");
        }
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    /////////////////////////////////////// RequestParam /////////////////////////////////

    //8
    // http://localhost:3333/sekizinci?query=55
    @GetMapping("/sekizinci")
    public String sekizinciMethod(Model model, @RequestParam(name = "{query}") Integer sayi){
        model.addAttribute("param_key", "Data_ID " + sayi);
        return "pathvariable";
    }

    // https://localhost:3333/dokuzuncu
    // https://localhost:3333/dokuzuncu?query=55
    @GetMapping("/dokuzuncu")
    public String dokuzuncuMethod(Model model, @RequestParam(name = "query", required = false) Long sayi){
        model.addAttribute("param_key", "Data_ID " + sayi);
        return "pathvariable";
    }

    // https://localhost:3333/onuncu
    // http://localhost:3333/onuncu?adi=Beytullah&soyadi=Zor
    @GetMapping("/onuncu")
    public String onuncuMethod(
            Model model,
            @RequestParam(name = "adi", required = false, defaultValue = "adinizi girmediniz") String adi,
            @RequestParam(name = "soyadi", required = false, defaultValue = " soyadinizi girmediniz") String soyadi
            ){
        model.addAttribute("param_key", "Data ID: " + adi + " " + soyadi);
        return "pathvariable";
    }

    // https://localhost:3333/onbirinci
    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model){
        Student student = new Student("Beytullah","Zor");
        model.addAttribute("param_key", "Data ID: " + student);
        return "pathvariable";
    }

    //////////////////////////////////// FORM ///////////////////

    // https://localhost:3333/onikinci
    @GetMapping("/onikinci")
    public String getForm(Model model){
        Student student = new Student();
        student.setStudentName("Adınızı Girmediniz...");
        student.setStudentSurname("Soyadınızı Girmediniz");

        model.addAttribute("form_key", "Data ID: " + student);
        return "form";
    }

    @PostMapping("/onikinci")
    public String postForm(Model model, Student student){
        log.info(student);
        model.addAttribute("form_key", "Data ID: " + student);
        return "form";
    }
}
