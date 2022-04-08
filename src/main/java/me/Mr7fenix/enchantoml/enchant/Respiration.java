package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.OxygenEnchantment;

public class Respiration extends OxygenEnchantment {
    public Respiration(Rarity p_45117_, EquipmentSlot... p_45118_) {
        super(p_45117_, p_45118_);
    }

    @Override
    public int getMaxLevel() {

        return Level.getLevel(Config.respiration.get());
    }
}
