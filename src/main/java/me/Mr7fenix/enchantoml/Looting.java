package me.Mr7fenix.enchantoml;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.LootBonusEnchantment;

public class Looting extends LootBonusEnchantment {
    protected Looting(Rarity p_45087_, EnchantmentCategory p_45088_, EquipmentSlot... p_45089_) {
        super(p_45087_, p_45088_, p_45089_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
