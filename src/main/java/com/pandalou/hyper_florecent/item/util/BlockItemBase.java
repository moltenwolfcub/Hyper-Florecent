package com.pandalou.hyper_florecent.item.util;

import com.pandalou.hyper_florecent.HyperFlorecent;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(HyperFlorecent.TAB));
    }

    public BlockItemBase(Block block, Properties properties) {
        super(block, properties.tab(HyperFlorecent.TAB));
    }
    
}
