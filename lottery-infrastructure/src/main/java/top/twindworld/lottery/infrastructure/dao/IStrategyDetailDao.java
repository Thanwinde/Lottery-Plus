package top.twindworld.lottery.infrastructure.dao;


import org.apache.ibatis.annotations.Mapper;
import top.twindworld.lottery.infrastructure.po.StrategyDetail;

import java.util.List;

/**
 *
 */
@Mapper
public interface IStrategyDetailDao {

    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

}
