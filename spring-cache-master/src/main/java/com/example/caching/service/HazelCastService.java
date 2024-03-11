package com.example.caching.service;

import com.example.caching.HazelCastDataModel.HazelCast;
import com.example.caching.repository.HazelCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HazelCastService {

    @Autowired
    public HazelCastRepository hazelCastRepository;

    public List<HazelCast> getCountryDetails(){
        List<HazelCast> country = hazelCastRepository.getAll();
        return country;

    }

}
