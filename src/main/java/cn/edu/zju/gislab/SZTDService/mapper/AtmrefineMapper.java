package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Atmrefine;
import cn.edu.zju.gislab.SZTDService.po.AtmrefineExample;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtmrefineMapper {
    int countByExample(AtmrefineExample example);

    int deleteByExample(AtmrefineExample example);

    int deleteByPrimaryKey(Timestamp dt);

    int insert(Atmrefine record);

    int insertSelective(Atmrefine record);

    List<Atmrefine> selectByExample(AtmrefineExample example);

    Atmrefine selectByPrimaryKey(Timestamp dt);

    int updateByExampleSelective(@Param("record") Atmrefine record, @Param("example") AtmrefineExample example);

    int updateByExample(@Param("record") Atmrefine record, @Param("example") AtmrefineExample example);

    int updateByPrimaryKeySelective(Atmrefine record);

    int updateByPrimaryKey(Atmrefine record);
}