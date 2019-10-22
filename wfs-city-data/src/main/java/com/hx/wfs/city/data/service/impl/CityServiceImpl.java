package com.hx.wfs.city.data.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hx.wfs.city.data.mapper.CityMapper;
import com.hx.wfs.city.data.model.City;
import com.hx.wfs.city.data.service.CityService;

import java.util.List;

/**
@author jxlgcmh
@date 2019-10-22 10:46
*/
@Service
public class CityServiceImpl implements CityService{

    @Resource
    private CityMapper cityMapper;

    @Override
    public int deleteByPrimaryKey(String areaid) {
        return cityMapper.deleteByPrimaryKey(areaid);
    }

    @Override
    public int insert(City record) {
        return cityMapper.insert(record);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(String areaid) {
        return cityMapper.selectByPrimaryKey(areaid);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<City> selectAll() {
        return cityMapper.selectAll();
    }

}
