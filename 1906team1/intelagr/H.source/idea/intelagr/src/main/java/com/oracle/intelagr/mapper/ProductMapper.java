package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    public List<Product> select(Map map) ;
}
