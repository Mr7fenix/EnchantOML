package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.SweepingEdgeEnchantment;

public class Sweeping extends SweepingEdgeEnchantment {
    public Sweeping(Rarity p_45186_, EquipmentSlot... p_45187_) {
        super(p_45186_, p_45187_);
    }

    @Override
    public int getMaxLevel() {

        return Level.getLevel(Config.sweeping.get());
    }
}
