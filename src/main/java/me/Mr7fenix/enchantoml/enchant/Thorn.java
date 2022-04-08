package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.ThornsEnchantment;

public class Thorn extends ThornsEnchantment {
    public Thorn(Rarity p_45196_, EquipmentSlot... p_45197_) {
        super(p_45196_, p_45197_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
