package com.developer_khusanjon.thymeleaf_templete.controller;

import com.developer_khusanjon.thymeleaf_templete.models.Nationality;
import com.developer_khusanjon.thymeleaf_templete.services.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class NationalityController {

    private final NationalityService nationalityService;

    public NationalityController(@Autowired NationalityService nationalityService) {
        this.nationalityService = nationalityService;
    }

    @GetMapping("/nationalities")
    public String getNationalities(Model model){
        model.addAttribute("millatlar",nationalityService.getNationalities());
        return "nationalities";
    }

    @GetMapping("/onenationality")
    @ResponseBody
    public Optional<Nationality> getNationalityById(Integer id,Model model){
        return nationalityService.getNationalityById(id);
    }

    @RequestMapping(value = "/save",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    public String updateNationality(Nationality nationality){
        nationalityService.updateNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(value = "/addNew",method = {RequestMethod.POST,RequestMethod.PUT,RequestMethod.GET})
    public String addNationality(Nationality nationality){
        nationalityService.addNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.PUT})
    public String deleteNationality(Integer id){
        nationalityService.deleteNationalityById(id);
        return "redirect:/nationalities";
    }



}
