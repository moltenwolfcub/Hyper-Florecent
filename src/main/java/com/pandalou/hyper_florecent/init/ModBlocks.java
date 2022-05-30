package com.pandalou.hyper_florecent.init;

import com.pandalou.hyper_florecent.HyperFlorecent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HyperFlorecent.MODID);

    public static final RegistryObject<Block> FLORECILLIUM_BLOCK = BLOCKS.register("florecillium_block", 
        ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.1f, 3.2f).requiresCorrectToolForDrops()
            .lightLevel((light) ->{ return 15; }).jumpFactor(4).speedFactor(1.1f).friction(1f).sound(SoundType.AMETHYST)));
}
