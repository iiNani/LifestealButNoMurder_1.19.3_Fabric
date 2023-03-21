package net.iinani.healththeft.item.custom;

import com.mojang.brigadier.ParseResults;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Objects;

public class HeartContainerItem extends Item {
    public HeartContainerItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            Objects.requireNonNull(user.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).
                    addPersistentModifier(new EntityAttributeModifier(user.getEntityName(),
                    2, EntityAttributeModifier.Operation.ADDITION));
            user.getStackInHand(Hand.MAIN_HAND).setCount(user.getStackInHand(Hand.MAIN_HAND).getCount() - 1);
        }
        return super.use(world, user, hand);
    }
}
