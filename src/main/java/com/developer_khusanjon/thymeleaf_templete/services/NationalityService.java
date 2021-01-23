package com.developer_khusanjon.thymeleaf_templete.services;

import com.developer_khusanjon.thymeleaf_templete.NationalityRepository;
import com.developer_khusanjon.thymeleaf_templete.models.Nationality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {

    private final NationalityRepository nationalityRepository;

    public NationalityService(@Autowired NationalityRepository nationalityRepository) {
        this.nationalityRepository = nationalityRepository;
    }

    public List<Nationality> getNationalities(){
        return (List<Nationality>) nationalityRepository.findAll();
    }

    public Optional<Nationality> getNationalityById(Integer id){
        return nationalityRepository.findById(id);
    }

    public void addNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }

    public void updateNationality(Nationality nationality){
        nationalityRepository.save(nationality);
    }

    public void deleteNationalityById(Integer id){
        nationalityRepository.deleteById(id);
    }

}
