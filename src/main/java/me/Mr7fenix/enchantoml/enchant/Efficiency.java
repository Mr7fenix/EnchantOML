package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DiggingEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;

public class Efficiency extends DiggingEnchantment {
    public Efficiency() {
        super(Enchantment.Rarity.COMMON, EquipmentSlot.MAINHAND);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
