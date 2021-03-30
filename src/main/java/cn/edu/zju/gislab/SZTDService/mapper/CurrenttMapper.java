package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Currentt;
import cn.edu.zju.gislab.SZTDService.po.CurrenttExample;
import java.sql.Timestamp;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrenttMapper {
    int countByExample(CurrenttExample example);

    int deleteByExample(CurrenttExample example);

    int deleteByPrimaryKey(Timestamp dt);

    int insert(Currentt record);

    int insertSelective(Currentt record);

    List<Currentt> selectByExample(CurrenttExample example);

    Currentt selectByPrimaryKey(Timestamp dt);

    int updateByExampleSelective(@Param("record") Currentt record, @Param("example") CurrenttExample example);

    int updateByExample(@Param("record") Currentt record, @Param("example") CurrenttExample example);

    int updateByPrimaryKeySelective(Currentt record);

    int updateByPrimaryKey(Currentt record);
}