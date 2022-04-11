package com.pandalou.hyper_florecent.item.util;

import com.pandalou.hyper_florecent.HyperFlorecent;

import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase(Properties properties) {
        super(properties.tab(HyperFlorecent.TAB));
    }

    public ItemBase() {
        super(new Item.Properties().tab(HyperFlorecent.TAB));
    }
    
}
