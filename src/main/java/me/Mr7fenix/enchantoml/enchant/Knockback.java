package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.KnockbackEnchantment;

public class Knockback extends KnockbackEnchantment {
    public Knockback(Rarity p_45079_, EquipmentSlot... p_45080_) {
        super(p_45079_, p_45080_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
