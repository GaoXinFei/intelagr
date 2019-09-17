package com.oracle.intelagr.service.impl;

import com.oracle.intelagr.entity.Contract;
import com.oracle.intelagr.mapper.ContractMapper;
import com.oracle.intelagr.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ContractService implements IContractService {
    @Autowired
    private ContractMapper contractMapper ;
    @Override
    public List<Contract> query(Map map) {
        return contractMapper.select(map);
    }
}
