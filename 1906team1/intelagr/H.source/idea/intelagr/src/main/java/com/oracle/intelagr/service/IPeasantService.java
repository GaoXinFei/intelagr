package com.oracle.intelagr.service;

import com.oracle.intelagr.entity.Peasant;

import java.util.List;

public interface IPeasantService {
    public Peasant queryById(String contractorID) ;
    public List<Peasant> query() ;
}
