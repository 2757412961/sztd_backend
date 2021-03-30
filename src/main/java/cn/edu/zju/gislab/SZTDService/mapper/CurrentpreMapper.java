package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Currentpre;
import cn.edu.zju.gislab.SZTDService.po.CurrentpreExample;
import cn.edu.zju.gislab.SZTDService.po.CurrentpreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrentpreMapper {
    int countByExample(CurrentpreExample example);

    int deleteByExample(CurrentpreExample example);

    int deleteByPrimaryKey(CurrentpreKey key);

    int insert(Currentpre record);

    int insertSelective(Currentpre record);

    List<Currentpre> selectByExample(CurrentpreExample example);

    Currentpre selectByPrimaryKey(CurrentpreKey key);

    int updateByExampleSelective(@Param("record") Currentpre record, @Param("example") CurrentpreExample example);

    int updateByExample(@Param("record") Currentpre record, @Param("example") CurrentpreExample example);

    int updateByPrimaryKeySelective(Currentpre record);

    int updateByPrimaryKey(Currentpre record);
}