package com.pandalou.hyper_florecent;

import com.mojang.logging.LogUtils;
import com.pandalou.hyper_florecent.init.ModItems;
import com.pandalou.hyper_florecent.item.util.MainCreativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("hyper_florecent")
public class HyperFlorecent
{
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab TAB = new MainCreativeTab();
    public static final String MODID = "hyper_florecent";

    public HyperFlorecent() {
        IEventBus registryBus = FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ModItems.ITEMS.register(registryBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){}
}
