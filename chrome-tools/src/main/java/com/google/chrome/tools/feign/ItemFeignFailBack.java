package com.google.chrome.tools.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.List;

@Slf4j
@Component
public class ItemFeignFailBack implements FallbackFactory<ItemFeign> {

    @Override
    public ItemFeign create(Throwable throwable) {
        return new ItemFeign() {
            @Override
            public Collection<Integer> items(List<Long> itemIds) {
                return null;
            }
        };
    }
}
