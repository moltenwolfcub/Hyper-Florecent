package com.pandalou.hyper_florecent.init;

import com.pandalou.hyper_florecent.HyperFlorecent;
import com.pandalou.hyper_florecent.item.PoopRemover;
import com.pandalou.hyper_florecent.item.util.BlockItemBase;
import com.pandalou.hyper_florecent.item.util.ItemBase;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HyperFlorecent.MODID);

    public static final RegistryObject<Item> FLORECILLIUM = ITEMS.register("florecillium", ItemBase::new);

    public static final RegistryObject<Item> POOP_REMOVER = ITEMS.register("poop_remover", () -> new PoopRemover());

    //BlockItems

    public static final RegistryObject<Item> FLORECILLIUM_BLOCK_ITEM = ITEMS.register("florecillium_block", 
        ()-> new BlockItemBase(ModBlocks.FLORECILLIUM_BLOCK.get()));
    
}
