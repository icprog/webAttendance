package com.cmhit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cmhit.po.System;
import com.cmhit.vo.Number;

public interface SystemMapper {
    int deleteByPrimaryKey(Integer systemid);

    int insert(System record);

    int insertSelective(System record);

    System selectByPrimaryKey(Integer systemid);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
    /**查询所有考勤制度**/
    public List<System> selectSystems();
    /**查询正在使用此制度的人数**/
    Number panDuanZhiDuShiFouShiYongZhong(@Param("systemid") int systemid);
}