package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.SoulSpeedEnchantment;

public class SoulSpeed extends SoulSpeedEnchantment {
    public SoulSpeed(Rarity p_45175_, EquipmentSlot... p_45176_) {
        super(p_45175_, p_45176_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
