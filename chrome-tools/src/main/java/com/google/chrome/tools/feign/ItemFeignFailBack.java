/*
package com.google.chrome.tools.feign;

import com.intel.data.core.model.item.Item;
import com.intel.tool.param.InventoryRollback;
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
            public Collection<Item> items(List<Long> itemIds) {
                return null;
            }

            @Override
            public Item queryById(Long id) {
                return null;
            }

            @Override
            public boolean inventoryRollback(InventoryRollback inventoryRollback) {
                return false;
            }

            @Override
            public void updateItem(Item item) {

            }
        };
    }
}
*/
