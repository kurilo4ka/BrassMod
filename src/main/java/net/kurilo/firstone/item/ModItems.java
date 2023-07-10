package net.kurilo.firstone.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kurilo.firstone.FirstOne;
import net.kurilo.firstone.item.custom.DowsingRodItem;
import net.kurilo.firstone.item.custom.ReapersSycleItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public class ModItems {
    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BRASS)));

    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.BRASS)));

    public static final Item RAW_BRASS = registerItem("raw_brass",
            new Item(new FabricItemSettings().group(ModItemGroup.BRASS)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.BRASS).maxDamage(16) ));

    public static final Item REAPERSS_SYCLE = registerItem("reapers_sycle",
            new ReapersSycleItem(new FabricItemSettings().group(ModItemGroup.BRASS).maxDamage(16) ));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstOne.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FirstOne.LOGGER.info("Registering Mod Items for " + FirstOne.MOD_ID);
    }
}
