package com.oracle.intelagr.service;

import com.oracle.intelagr.entity.Contract;

import java.util.List;
import java.util.Map;

public interface IContractService {
    public List<Contract> query(Map map) ;
}
