package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.FrostWalkerEnchantment;

public class FrostWalker extends FrostWalkerEnchantment {
    public FrostWalker(Rarity p_45013_, EquipmentSlot... p_45014_) {
        super(p_45013_, p_45014_);
    }

    @Override
    public int getMaxLevel() {

        return Level.getLevel(Config.frostWalker.get());
    }
}
