package net.kurilo.firstone.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.kurilo.firstone.FirstOne;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BRASS = FabricItemGroupBuilder.build(new Identifier(FirstOne.MOD_ID, "brass"),
            () -> new ItemStack(ModItems.BRASS_INGOT ));
}
