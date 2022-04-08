package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.ArrowKnockbackEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;

public class Punch extends ArrowKnockbackEnchantment {
    public Punch(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pApplicableSlots);
    }

    @Override
    public int getMaxLevel() {
        return Level.getLevel(Config.punch.get());
    }
}
