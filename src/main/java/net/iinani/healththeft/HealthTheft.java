package net.iinani.healththeft;

import net.fabricmc.api.ModInitializer;
import net.iinani.healththeft.item.ModItemGroup;
import net.iinani.healththeft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthTheft implements ModInitializer {
	public static final String MOD_ID = "healththeft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
