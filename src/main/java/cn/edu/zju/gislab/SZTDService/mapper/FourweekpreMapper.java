package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Fourweekpre;
import cn.edu.zju.gislab.SZTDService.po.FourweekpreExample;
import cn.edu.zju.gislab.SZTDService.po.FourweekpreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FourweekpreMapper {
    int countByExample(FourweekpreExample example);

    int deleteByExample(FourweekpreExample example);

    int deleteByPrimaryKey(FourweekpreKey key);

    int insert(Fourweekpre record);

    int insertSelective(Fourweekpre record);

    List<Fourweekpre> selectByExample(FourweekpreExample example);

    Fourweekpre selectByPrimaryKey(FourweekpreKey key);

    int updateByExampleSelective(@Param("record") Fourweekpre record, @Param("example") FourweekpreExample example);

    int updateByExample(@Param("record") Fourweekpre record, @Param("example") FourweekpreExample example);

    int updateByPrimaryKeySelective(Fourweekpre record);

    int updateByPrimaryKey(Fourweekpre record);
}