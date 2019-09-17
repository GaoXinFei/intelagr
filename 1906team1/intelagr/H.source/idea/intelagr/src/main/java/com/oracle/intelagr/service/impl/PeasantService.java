package com.oracle.intelagr.service.impl;

import com.oracle.intelagr.entity.Peasant;
import com.oracle.intelagr.mapper.PeasantMapper;
import com.oracle.intelagr.service.IPeasantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeasantService implements IPeasantService{
    @Autowired
    private PeasantMapper peasantMapper ;
    @Override
    public Peasant queryById(String contractorID) {
        return peasantMapper.selectById(contractorID);
    }

    @Override
    public List<Peasant> query() {
        return null;
    }
}
