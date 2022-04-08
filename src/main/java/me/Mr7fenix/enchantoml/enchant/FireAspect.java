package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.FireAspectEnchantment;

public class FireAspect extends FireAspectEnchantment {
    public FireAspect(Rarity p_44996_, EquipmentSlot... p_44997_) {
        super(p_44996_, p_44997_);
    }

    @Override
    public int getMaxLevel() {
        return Level.getLevel(Config.fireAspect.get());
    }
}
