package com.example.loganalysis.controller;

import com.example.loganalysis.entity.IpCount;
import com.example.loganalysis.repository.IpCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ipcount")
public class IpCountController {

    @Autowired
    private IpCountRepository ipCountRepository;

    @GetMapping
    public List<IpCount> getAllIpCount() {
        return ipCountRepository.findAll();
    }
}