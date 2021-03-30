package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Weathersitenew;
import cn.edu.zju.gislab.SZTDService.po.WeathersitenewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeathersitenewMapper {
    int countByExample(WeathersitenewExample example);

    int deleteByExample(WeathersitenewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Weathersitenew record);

    int insertSelective(Weathersitenew record);

    List<Weathersitenew> selectByExample(WeathersitenewExample example);

    Weathersitenew selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Weathersitenew record, @Param("example") WeathersitenewExample example);

    int updateByExample(@Param("record") Weathersitenew record, @Param("example") WeathersitenewExample example);

    int updateByPrimaryKeySelective(Weathersitenew record);

    int updateByPrimaryKey(Weathersitenew record);
}