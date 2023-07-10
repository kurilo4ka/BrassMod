package net.kurilo.firstone.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kurilo.firstone.FirstOne;
import net.kurilo.firstone.block.custom.SpeedyBlock;
import net.kurilo.firstone.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block BRASS_BLOCK = registerBlock("brass_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.BRASS);

    public static final Block BRASS_ORE = registerBlock("brass_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.BRASS);

    public static final Block DEEPSLATE_BRASS_ORE = registerBlock("deepslate_brass_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.BRASS);

    public static final Block RAW_BRASS_ORE = registerBlock("raw_brass_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.BRASS);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.BRASS);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FirstOne.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(FirstOne.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        FirstOne.LOGGER.info("Registering ModBlocks for " + FirstOne.MOD_ID);
    }

}
