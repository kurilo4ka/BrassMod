package net.kurilo.firstone;

import net.fabricmc.api.ModInitializer;
import net.kurilo.firstone.block.ModBlocks;
import net.kurilo.firstone.item.ModItems;
import net.kurilo.firstone.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstOne implements ModInitializer {

	public static final String MOD_ID = "firstone";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGen.generateModWorldGen();
	}
}
