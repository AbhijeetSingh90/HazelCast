package com.example.caching.controller;

import com.example.caching.HazelCastDataModel.HazelCast;
import com.example.caching.service.HazelCastService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class CacheController {
    private static final Logger logger = getLogger(CacheController.class);

    @Autowired
    public HazelCastService hazelCastService;

    @GetMapping(value = "/test")
    @Cacheable(value = "testCache", key = "#hazelcastId")
    public List<HazelCast> getTest(@RequestHeader("HazelCast-ID") String hazelcastId) {
        logger.info("Inside Test endpoint...");
        logger.info("Please wait... We are still Processing your Data with ID: {}", hazelcastId);
        return hazelCastService.getCountryDetails();
    }

}
