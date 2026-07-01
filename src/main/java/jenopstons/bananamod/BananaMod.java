package jenopstons.bananamod;

import jenopstons.bananamod.item.ModItems;
import jenopstons.bananamod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BananaMod implements ModInitializer {
	public static final String MOD_ID = "bananamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModLootTableModifiers.modifyLootTables();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
