package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.FishingSpeedEnchantment;

public class Lure extends FishingSpeedEnchantment {
    public Lure(Rarity p_45004_, EnchantmentCategory p_45005_, EquipmentSlot... p_45006_) {
        super(p_45004_, p_45005_, p_45006_);
    }

    @Override
    public int getMaxLevel() {

        return Level.getLevel(Config.lure.get());
    }
}
