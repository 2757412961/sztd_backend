package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Dailypre;
import cn.edu.zju.gislab.SZTDService.po.DailypreExample;
import cn.edu.zju.gislab.SZTDService.po.DailypreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailypreMapper {
    int countByExample(DailypreExample example);

    int deleteByExample(DailypreExample example);

    int deleteByPrimaryKey(DailypreKey key);

    int insert(Dailypre record);

    int insertSelective(Dailypre record);

    List<Dailypre> selectByExample(DailypreExample example);

    Dailypre selectByPrimaryKey(DailypreKey key);

    int updateByExampleSelective(@Param("record") Dailypre record, @Param("example") DailypreExample example);

    int updateByExample(@Param("record") Dailypre record, @Param("example") DailypreExample example);

    int updateByPrimaryKeySelective(Dailypre record);

    int updateByPrimaryKey(Dailypre record);
}