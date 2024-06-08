package com.slimesarecool.ametrine_delights.item;

import com.slimesarecool.ametrine_delights.AmetrineDelights;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AmetrineDelights.MODID);

    public static final RegistryObject<Item> AMETRINE_SHARD = ITEMS.register("ametrine_shard", () -> new Item((new Item.Properties().tab(ModCreativeModeTab.AMETRINE_DELIGHTS_TAB))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
