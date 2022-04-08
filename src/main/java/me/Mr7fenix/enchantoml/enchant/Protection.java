package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;

public class Protection extends ProtectionEnchantment {
    public Protection(Rarity p_45126_, Type p_45127_, EquipmentSlot... p_45128_) {
        super(p_45126_, p_45127_, p_45128_);
    }

    @Override
    public int getMaxLevel() {
        return switch (this.type) {
            case ALL -> Level.getLevel(Config.protection.get());
            case FIRE -> Level.getLevel(Config.fireProtection.get());
            case EXPLOSION -> Level.getLevel(Config.blastProtection.get());
            case PROJECTILE -> Level.getLevel(Config.projectileProtection.get());
            case FALL -> Level.getLevel(Config.featherFalling.get());
        };
    }

}
