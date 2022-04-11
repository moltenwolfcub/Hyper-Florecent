package com.pandalou.hyper_florecent.init;

import com.pandalou.hyper_florecent.HyperFlorecent;
import com.pandalou.hyper_florecent.item.util.ItemBase;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyperFlorecent.MODID);

    public static final RegistryObject<Item> FLORECILLIUM = ITEMS.register("florecillium", ItemBase::new);
    
}
