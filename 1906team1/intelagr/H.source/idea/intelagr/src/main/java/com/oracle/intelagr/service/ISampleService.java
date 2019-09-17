package com.oracle.intelagr.service;

import com.oracle.intelagr.entity.Sample;

import java.util.List;

public interface ISampleService {
    public List<Sample> selectAll();
}
