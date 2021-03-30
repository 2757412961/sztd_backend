package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Adcpinfonew;
import cn.edu.zju.gislab.SZTDService.po.AdcpinfonewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdcpinfonewMapper {
    int countByExample(AdcpinfonewExample example);

    int deleteByExample(AdcpinfonewExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Adcpinfonew record);

    int insertSelective(Adcpinfonew record);

    List<Adcpinfonew> selectByExample(AdcpinfonewExample example);

    Adcpinfonew selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Adcpinfonew record, @Param("example") AdcpinfonewExample example);

    int updateByExample(@Param("record") Adcpinfonew record, @Param("example") AdcpinfonewExample example);

    int updateByPrimaryKeySelective(Adcpinfonew record);

    int updateByPrimaryKey(Adcpinfonew record);
}