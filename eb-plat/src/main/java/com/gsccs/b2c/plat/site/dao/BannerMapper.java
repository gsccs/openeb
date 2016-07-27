package com.gsccs.b2c.plat.site.dao;

import com.gsccs.b2c.plat.site.model.Banner;
import com.gsccs.b2c.plat.site.model.BannerExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    int countByExample(BannerExample example);

    int deleteByExample(BannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(@Param("sid") Long sid, @Param("record")Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerExample example);

    Banner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}