/*
package com.google.chrome.tools.feign;

import com.intel.data.core.model.item.Item;
import com.intel.tool.param.InventoryRollback;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.Collection;
import java.util.List;

@FeignClient(name = "intel-core-mall",fallback = ItemFeignFailBack.class)
@RequestMapping(value = "/mall/item")
public interface ItemFeign {

    @PostMapping(value = "/items")
     Collection<Item> items(@RequestBody List<Long> itemIds);

    @GetMapping(value = "/byId/{id}")
    Item queryById(@PathVariable("id") Long id);

    @PostMapping(value = "/rollback")
     boolean inventoryRollback(@RequestBody InventoryRollback inventoryRollback);

    @PostMapping(value = "/update")
    void updateItem(@RequestBody Item item);
}
*/
