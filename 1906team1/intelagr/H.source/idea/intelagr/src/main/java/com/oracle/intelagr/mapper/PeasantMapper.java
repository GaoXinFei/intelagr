package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.Peasant;

import java.util.List;

public interface PeasantMapper {
    public List<Peasant> selectAll() ;
    public int count() ;
    public Peasant selectById(String contractorID) ;

}
