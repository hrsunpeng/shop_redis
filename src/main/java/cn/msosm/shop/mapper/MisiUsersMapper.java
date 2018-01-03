package cn.msosm.shop.mapper;

import cn.msosm.shop.pojo.MisiUsers;
import cn.msosm.shop.pojo.MisiUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MisiUsersMapper {
    int countByExample(MisiUsersExample example);

    int deleteByExample(MisiUsersExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MisiUsers record);

    int insertSelective(MisiUsers record);

    List<MisiUsers> selectByExample(MisiUsersExample example);

    MisiUsers selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MisiUsers record, @Param("example") MisiUsersExample example);

    int updateByExample(@Param("record") MisiUsers record, @Param("example") MisiUsersExample example);

    int updateByPrimaryKeySelective(MisiUsers record);

    int updateByPrimaryKey(MisiUsers record);
}