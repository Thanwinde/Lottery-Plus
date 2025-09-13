package top.twindworld.lottery.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.twindworld.lottery.infrastructure.po.Award;

import java.util.List;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

    void insertList(List<Award> list);

}
