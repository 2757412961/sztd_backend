package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Wave;
import cn.edu.zju.gislab.SZTDService.po.WaveExample;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaveMapper {
    int countByExample(WaveExample example);

    int deleteByExample(WaveExample example);

    int deleteByPrimaryKey(Timestamp dt);

    int insert(Wave record);

    int insertSelective(Wave record);

    List<Wave> selectByExample(WaveExample example);

    Wave selectByPrimaryKey(Timestamp dt);

    int updateByExampleSelective(@Param("record") Wave record, @Param("example") WaveExample example);

    int updateByExample(@Param("record") Wave record, @Param("example") WaveExample example);

    int updateByPrimaryKeySelective(Wave record);

    int updateByPrimaryKey(Wave record);
}