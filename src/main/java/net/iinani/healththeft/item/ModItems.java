package net.iinani.healththeft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.iinani.healththeft.HealthTheft;
import net.iinani.healththeft.item.custom.HeartContainerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HEART_CONTAINER = registerItem("heart_container",
            new HeartContainerItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HealthTheft.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.HEART, HEART_CONTAINER);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        HealthTheft.LOGGER.debug("Registering Mod Items for " + HealthTheft.MOD_ID);
        addItemsToItemGroup();
    }
}
