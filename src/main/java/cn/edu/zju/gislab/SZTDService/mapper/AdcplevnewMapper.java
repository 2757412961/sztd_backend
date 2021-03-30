package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Adcplevnew;
import cn.edu.zju.gislab.SZTDService.po.AdcplevnewExample;
import cn.edu.zju.gislab.SZTDService.po.AdcplevnewKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdcplevnewMapper {
    int countByExample(AdcplevnewExample example);

    int deleteByExample(AdcplevnewExample example);

    int deleteByPrimaryKey(AdcplevnewKey key);

    int insert(Adcplevnew record);

    int insertSelective(Adcplevnew record);

    List<Adcplevnew> selectByExample(AdcplevnewExample example);

    Adcplevnew selectByPrimaryKey(AdcplevnewKey key);

    int updateByExampleSelective(@Param("record") Adcplevnew record, @Param("example") AdcplevnewExample example);

    int updateByExample(@Param("record") Adcplevnew record, @Param("example") AdcplevnewExample example);

    int updateByPrimaryKeySelective(Adcplevnew record);

    int updateByPrimaryKey(Adcplevnew record);
}