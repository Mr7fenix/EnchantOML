package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.WaterWalkerEnchantment;

public class DepthStrider extends WaterWalkerEnchantment {
    public DepthStrider(Rarity p_45280_, EquipmentSlot... p_45281_) {
        super(p_45280_, p_45281_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
