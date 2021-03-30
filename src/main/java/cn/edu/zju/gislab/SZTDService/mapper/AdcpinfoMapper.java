package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Adcpinfo;
import cn.edu.zju.gislab.SZTDService.po.AdcpinfoExample;
import cn.edu.zju.gislab.SZTDService.po.AdcpinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdcpinfoMapper {
    int countByExample(AdcpinfoExample example);

    int deleteByExample(AdcpinfoExample example);

    int deleteByPrimaryKey(AdcpinfoKey key);

    int insert(Adcpinfo record);

    int insertSelective(Adcpinfo record);

    List<Adcpinfo> selectByExample(AdcpinfoExample example);

    Adcpinfo selectByPrimaryKey(AdcpinfoKey key);

    int updateByExampleSelective(@Param("record") Adcpinfo record, @Param("example") AdcpinfoExample example);

    int updateByExample(@Param("record") Adcpinfo record, @Param("example") AdcpinfoExample example);

    int updateByPrimaryKeySelective(Adcpinfo record);

    int updateByPrimaryKey(Adcpinfo record);
}