package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Atm;
import cn.edu.zju.gislab.SZTDService.po.AtmExample;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtmMapper {
    int countByExample(AtmExample example);

    int deleteByExample(AtmExample example);

    int deleteByPrimaryKey(Timestamp dt);

    int insert(Atm record);

    int insertSelective(Atm record);

    List<Atm> selectByExample(AtmExample example);

    Atm selectByPrimaryKey(Timestamp dt);

    int updateByExampleSelective(@Param("record") Atm record, @Param("example") AtmExample example);

    int updateByExample(@Param("record") Atm record, @Param("example") AtmExample example);

    int updateByPrimaryKeySelective(Atm record);

    int updateByPrimaryKey(Atm record);
}