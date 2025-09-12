package top.twindworld.lottery.domain.strategy.repository.impl;

import org.springframework.stereotype.Component;
import top.twindworld.lottery.domain.strategy.model.aggregates.StrategyRich;
import top.twindworld.lottery.domain.strategy.repository.IStrategyRepository;
import top.twindworld.lottery.infrastructure.dao.IAwardDao;
import top.twindworld.lottery.infrastructure.dao.IStrategyDao;
import top.twindworld.lottery.infrastructure.dao.IStrategyDetailDao;
import top.twindworld.lottery.infrastructure.po.Award;
import top.twindworld.lottery.infrastructure.po.Strategy;
import top.twindworld.lottery.infrastructure.po.StrategyDetail;

import javax.annotation.Resource;
import java.util.List;

@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

}
