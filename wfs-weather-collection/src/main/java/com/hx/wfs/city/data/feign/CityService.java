package com.hx.wfs.city.data.feign;

import com.hx.wfs.model.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jxlgcmh
 * @date 2019-10-26 16:57
 */
@FeignClient(value = "wfs-getway-zuul")
public interface CityService {
    /**
     * 获取城json数据
     *
     * @param
     * @return
     */
    @RequestMapping("/city/cities")
    List<City> getAllCities();
}
