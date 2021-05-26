package com.google.chrome.tools.feign;

import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.Collection;
import java.util.List;

@FeignClient(name = "intel-core-mall",fallback = ItemFeignFailBack.class,configuration = FeignDisableHystrix.class)
@RequestMapping(value = "/mall/item")
public interface ItemFeign {

    @PostMapping(value = "/items")
     Collection<Integer> items(@RequestBody List<Long> itemIds);

}
