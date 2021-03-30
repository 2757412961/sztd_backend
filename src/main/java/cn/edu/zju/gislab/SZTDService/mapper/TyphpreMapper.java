package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Typhpre;
import cn.edu.zju.gislab.SZTDService.po.TyphpreExample;
import cn.edu.zju.gislab.SZTDService.po.TyphpreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TyphpreMapper {
    int countByExample(TyphpreExample example);

    int deleteByExample(TyphpreExample example);

    int deleteByPrimaryKey(TyphpreKey key);

    int insert(Typhpre record);

    int insertSelective(Typhpre record);

    List<Typhpre> selectByExample(TyphpreExample example);

    Typhpre selectByPrimaryKey(TyphpreKey key);

    int updateByExampleSelective(@Param("record") Typhpre record, @Param("example") TyphpreExample example);

    int updateByExample(@Param("record") Typhpre record, @Param("example") TyphpreExample example);

    int updateByPrimaryKeySelective(Typhpre record);

    int updateByPrimaryKey(Typhpre record);
}