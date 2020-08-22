package com.cabiccraft.core;

import com.cabiccraft.core.init.BlockInit;
import com.cabiccraft.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("cabiccraft")
@Mod.EventBusSubscriber(modid = CabicCraft.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class CabicCraft
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cabiccraft";

    public CabicCraft() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onServerStarting);
        //Register Stuff//
        BlockInit.BLOCKS.register(modEventBus); CabicCraft.LOGGER.info("Blocks Registered");
        ItemInit.ITEMS.register(modEventBus); CabicCraft.LOGGER.info("Items Registered");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        CabicCraft.LOGGER.info("FMLCommonSetupEvent complete!");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        CabicCraft.LOGGER.info("FMLClientSetupEvent complete!");
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

}
