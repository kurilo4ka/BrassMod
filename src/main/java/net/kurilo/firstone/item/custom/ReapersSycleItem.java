package net.kurilo.firstone.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class ReapersSycleItem extends Item {
    public ReapersSycleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()){
            if(hand == Hand.MAIN_HAND) {
                user.damage(DamageSource.player(user), 6);
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 40, 2));

            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}