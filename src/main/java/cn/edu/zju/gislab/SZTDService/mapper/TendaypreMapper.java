package cn.edu.zju.gislab.SZTDService.mapper;

import cn.edu.zju.gislab.SZTDService.po.Tendaypre;
import cn.edu.zju.gislab.SZTDService.po.TendaypreExample;
import cn.edu.zju.gislab.SZTDService.po.TendaypreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TendaypreMapper {
    int countByExample(TendaypreExample example);

    int deleteByExample(TendaypreExample example);

    int deleteByPrimaryKey(TendaypreKey key);

    int insert(Tendaypre record);

    int insertSelective(Tendaypre record);

    List<Tendaypre> selectByExample(TendaypreExample example);

    Tendaypre selectByPrimaryKey(TendaypreKey key);

    int updateByExampleSelective(@Param("record") Tendaypre record, @Param("example") TendaypreExample example);

    int updateByExample(@Param("record") Tendaypre record, @Param("example") TendaypreExample example);

    int updateByPrimaryKeySelective(Tendaypre record);

    int updateByPrimaryKey(Tendaypre record);
}