package com.pandalou.hyper_florecent.item.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(properties);
    }

    public ItemBase() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MISC));
    }
    
}
