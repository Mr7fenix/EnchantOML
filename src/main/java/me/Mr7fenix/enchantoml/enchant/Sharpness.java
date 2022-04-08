package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DamageEnchantment;

public class Sharpness extends DamageEnchantment {
    public Sharpness(Rarity rarity, int type, EquipmentSlot... equipmentSlots) {
        super(rarity, type, equipmentSlots);
    }

    @Override
    public int getMaxLevel() {
        return switch (this.type) {
            case 0 -> Level.getLevel(Config.sharpness.get());
            case 1 -> Level.getLevel(Config.smite.get());
            default -> 10;
        };
    }
}
