package com.lmy.gateway.feign.fallback;

import cn.hutool.core.collection.CollectionUtil;
import com.lmy.gateway.feign.MenuService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * menuService降级工场
 *
 * @author lmy
 * @date 2019/1/18
 */
@Slf4j
@Component
public class MenuServiceFallbackFactory implements FallbackFactory<MenuService> {
    @Override
    public MenuService create(Throwable throwable) {
        return roleIds -> {
            log.error("调用findByRoleCodes异常：{}", roleIds, throwable);
            return CollectionUtil.newArrayList();
        };
    }
}
