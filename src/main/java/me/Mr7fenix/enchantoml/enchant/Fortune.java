package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.LootBonusEnchantment;

public class Fortune extends LootBonusEnchantment {
    public Fortune(Rarity p_45087_, EnchantmentCategory p_45088_, EquipmentSlot... p_45089_) {
        super(p_45087_, p_45088_, p_45089_);
    }

    @Override
    public int getMaxLevel() {
        return Level.getLevel(Config.fortune.get());
    }
}
