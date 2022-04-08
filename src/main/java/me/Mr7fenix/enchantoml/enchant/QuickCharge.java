package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.QuickChargeEnchantment;

public class QuickCharge extends QuickChargeEnchantment {
    public QuickCharge(Rarity pRarity, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pApplicableSlots);
    }

    @Override
    public int getMaxLevel() {
        return Level.getLevel(Config.quickcharge.get());
    }
}
