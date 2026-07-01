package jenopstons.bananamod.item;

import jenopstons.bananamod.BananaMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BananaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BananaMod.LOGGER.info("Registering Mod Items for " + BananaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BANANA);
        });
    }
}
