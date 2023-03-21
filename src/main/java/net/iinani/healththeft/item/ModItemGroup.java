package net.iinani.healththeft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.iinani.healththeft.HealthTheft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup HEART;

    public static void registerItemGroups() {
        HEART = FabricItemGroup.builder(new Identifier(HealthTheft.MOD_ID, "heart_container"))
                .displayName(Text.translatable("itemgroup.heart"))
                .icon(() -> new ItemStack(ModItems.HEART_CONTAINER)).build();
    }

}
