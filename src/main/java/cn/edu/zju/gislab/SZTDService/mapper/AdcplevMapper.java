package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Adcplev;
import cn.edu.zju.gislab.SZTDService.po.AdcplevExample;
import cn.edu.zju.gislab.SZTDService.po.AdcplevKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdcplevMapper {
    int countByExample(AdcplevExample example);

    int deleteByExample(AdcplevExample example);

    int deleteByPrimaryKey(AdcplevKey key);

    int insert(Adcplev record);

    int insertSelective(Adcplev record);

    List<Adcplev> selectByExample(AdcplevExample example);

    Adcplev selectByPrimaryKey(AdcplevKey key);

    int updateByExampleSelective(@Param("record") Adcplev record, @Param("example") AdcplevExample example);

    int updateByExample(@Param("record") Adcplev record, @Param("example") AdcplevExample example);

    int updateByPrimaryKeySelective(Adcplev record);

    int updateByPrimaryKey(Adcplev record);
}