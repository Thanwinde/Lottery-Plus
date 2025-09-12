package top.twindworld.lottery.domain.support.ids.policy;

import cn.hutool.core.util.RandomUtil;
import org.springframework.stereotype.Component;
import top.twindworld.lottery.domain.support.ids.IIdGenerator;

/**
 * @description: 工具类生成 org.apache.commons.lang3.RandomStringUtils
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/20
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return RandomUtil.randomLong((long) 1e+11);
    }

}
