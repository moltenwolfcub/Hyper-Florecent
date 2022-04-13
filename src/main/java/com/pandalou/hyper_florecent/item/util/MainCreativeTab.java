package com.pandalou.hyper_florecent.item.util;

import com.pandalou.hyper_florecent.HyperFlorecent;
import com.pandalou.hyper_florecent.init.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MainCreativeTab extends CreativeModeTab {

    public MainCreativeTab() {
        super(HyperFlorecent.MODID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.FLORECILLIUM_BLOCK_ITEM.get());
    }
    
}
