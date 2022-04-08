package me.Mr7fenix.enchantoml;

import me.Mr7fenix.enchantoml.enchant.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Register {
    DeferredRegister<Enchantment> deferredRegister = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "minecraft");
    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};



    RegistryObject<Enchantment> efficiency = deferredRegister.register("efficiency", Efficiency::new);
    RegistryObject<Enchantment> protection = deferredRegister.register("protection", () -> new Protection(Enchantment.Rarity.COMMON, Protection.Type.ALL, ARMOR_SLOTS));
    RegistryObject<Enchantment> protectionfire = deferredRegister.register("fire_protection", () -> new Protection(Enchantments.FIRE_PROTECTION.getRarity(), Protection.Type.FIRE, ARMOR_SLOTS));
    RegistryObject<Enchantment> protectionfall = deferredRegister.register("feather_falling", () -> new Protection(Enchantments.FALL_PROTECTION.getRarity(), Protection.Type.FALL, ARMOR_SLOTS));
    RegistryObject<Enchantment> protectionexplosion = deferredRegister.register("blast_protection", () -> new Protection(Enchantments.BLAST_PROTECTION.getRarity(), Protection.Type.EXPLOSION, ARMOR_SLOTS));
    RegistryObject<Enchantment> protectionprojectile = deferredRegister.register("projectile_protection", () -> new Protection(Enchantments.PROJECTILE_PROTECTION.getRarity(), Protection.Type.PROJECTILE, ARMOR_SLOTS));
    RegistryObject<Enchantment> respiration = deferredRegister.register("respiration", () -> new Respiration(Enchantments.RESPIRATION.getRarity(), ARMOR_SLOTS));
    RegistryObject<Enchantment> acquaaffinity = deferredRegister.register("aqua_affinity", () -> new AcquaAffinity(Enchantments.AQUA_AFFINITY.getRarity(), ARMOR_SLOTS));
    RegistryObject<Enchantment> thorns = deferredRegister.register("thorns", () -> new Thorn(Enchantments.THORNS.getRarity(), ARMOR_SLOTS));
    RegistryObject<Enchantment> depthstrider = deferredRegister.register("depth_strider", () -> new DepthStrider(Enchantments.DEPTH_STRIDER.getRarity(), ARMOR_SLOTS));
    RegistryObject<Enchantment> frostwalker = deferredRegister.register("frost_walker", () -> new FrostWalker(Enchantments.FROST_WALKER.getRarity(), EquipmentSlot.FEET));
    RegistryObject<Enchantment> soulspeed = deferredRegister.register("soul_speed", () -> new SoulSpeed(Enchantments.SOUL_SPEED.getRarity(), EquipmentSlot.FEET));
    RegistryObject<Enchantment> sharpness = deferredRegister.register("sharpness", () -> new Sharpness(Enchantments.SHARPNESS.getRarity(), 0, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> smite = deferredRegister.register("smite", () -> new Sharpness(Enchantments.SMITE.getRarity(), 1, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> baneofarthropods = deferredRegister.register("bane_of_arthropods", () -> new Sharpness(Enchantments.BANE_OF_ARTHROPODS.getRarity(), 2, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> knockback = deferredRegister.register("knockback", () -> new Knockback(Enchantments.KNOCKBACK.getRarity(), EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> fireaspect = deferredRegister.register("fire_aspect", () -> new FireAspect(Enchantments.FIRE_ASPECT.getRarity(), EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> looting = deferredRegister.register("looting", () -> new Looting(Enchantments.MOB_LOOTING.getRarity(), EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> sweeping = deferredRegister.register("sweeping", () -> new Sweeping(Enchantments.SWEEPING_EDGE.getRarity(), EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    RegistryObject<Enchantment> unbreaking = deferredRegister.register("unbreaking", () -> new Unbreaking(Enchantments.UNBREAKING.getRarity(), 0, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> fortune = deferredRegister.register("fortune", () -> new Fortune(Enchantments.FORTUNE.getRarity(), 0, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> power = deferredRegister.register("power", () -> new Power(Enchantments.POWER.getRarity(), 0, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> punch = deferredRegister.register("punch", () -> new Punch(Enchantments.PUNCH.getRarity(), 0, EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> luckofsea = deferredRegister.register("luck_of_the_sea", () -> new LuckOfSea(Enchantments.LUCK_OF_THE_SEA.getRarity(), EquipmentSlot.MAINHAND));
    RegistryObject<Enchantment> lure = deferredRegister.register("lure", () -> new Lure(

    public void init() {
        deferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
