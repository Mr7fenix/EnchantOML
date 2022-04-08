package me.Mr7fenix.enchantoml;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.FireAspectEnchantment;

public class FireAspect extends FireAspectEnchantment {
    protected FireAspect(Rarity p_44996_, EquipmentSlot... p_44997_) {
        super(p_44996_, p_44997_);
    }

    @Override
    public int getMaxLevel() {
        return Config.maxEnchantLevel.get();
    }
}
