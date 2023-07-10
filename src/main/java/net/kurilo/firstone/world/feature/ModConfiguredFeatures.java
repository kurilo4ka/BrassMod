package net.kurilo.firstone.world.feature;

import net.kurilo.firstone.FirstOne;
import net.kurilo.firstone.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_BRASS_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BRASS_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_BRASS_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BRASS_ORE =
            ConfiguredFeatures.register("brass_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_BRASS_ORES, 9));

    public static void registerConfiguredFeatures(){
        System.out.println("Registering ModConfiguredFeatures for " + FirstOne.MOD_ID);
    }
}
