package com.slimesarecool.ametrine_delights.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AMETRINE_DELIGHTS_TAB = new CreativeModeTab("ametrine_delights") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETRINE_SHARD.get());
        }
    };
}
