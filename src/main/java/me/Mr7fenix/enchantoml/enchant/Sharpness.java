package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DamageEnchantment;

public class Sharpness extends DamageEnchantment {
    public Sharpness(Rarity p_44628_, int p_44629_, EquipmentSlot... p_44630_) {
        super(p_44628_, p_44629_, p_44630_);
    }

    @Override
    public int getMaxLevel() {

        return Level.getLevel(Config.sharpness.get());
    }
}
