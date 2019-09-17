package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.Contract;

import java.util.List;
import java.util.Map;

public interface ContractMapper {
    public List<Contract> select(Map map) ;
}
