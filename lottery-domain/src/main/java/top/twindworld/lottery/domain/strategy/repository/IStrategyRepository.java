package top.twindworld.lottery.domain.strategy.repository;


import top.twindworld.lottery.domain.strategy.model.aggregates.StrategyRich;
import top.twindworld.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
