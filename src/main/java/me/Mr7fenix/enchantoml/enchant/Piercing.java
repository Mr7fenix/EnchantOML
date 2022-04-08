package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.ArrowPiercingEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;

public class Piercing extends ArrowPiercingEnchantment {
    public Piercing(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pApplicableSlots);
    }

    @Override
    public int getMaxLevel() {
        return Level.getLevel(Config.piercing.get());
    }
}
