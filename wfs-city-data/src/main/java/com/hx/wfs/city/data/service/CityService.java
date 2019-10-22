package com.hx.wfs.city.data.service;

import com.hx.wfs.city.data.model.City;

import java.util.List;

/**
@author jxlgcmh
@date 2019-10-22 10:46
*/
public interface CityService{


    int deleteByPrimaryKey(String areaid);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(String areaid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> selectAll();
    }
