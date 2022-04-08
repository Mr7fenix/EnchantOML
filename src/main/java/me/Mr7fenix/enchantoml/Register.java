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
    static DeferredRegister<Enchantment> deferredRegister = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "minecraft");
    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};



    static RegistryObject<Enchantment> efficiency = deferredRegister.register("efficiency", Efficiency::new);
    static RegistryObject<Enchantment> protection = deferredRegister.register("protection", () -> new Protection(Enchantment.Rarity.COMMON, Protection.Type.ALL, ARMOR_SLOTS));
    static RegistryObject<Enchantment> protectionfire = deferredRegister.register("fire_protection", () -> new Protection(Enchantments.FIRE_PROTECTION.getRarity(), Protection.Type.FIRE, ARMOR_SLOTS));
    static RegistryObject<Enchantment> protectionfall = deferredRegister.register("feather_falling", () -> new Protection(Enchantments.FALL_PROTECTION.getRarity(), Protection.Type.FALL, ARMOR_SLOTS));
    static RegistryObject<Enchantment> protectionexplosion = deferredRegister.register("blast_protection", () -> new Protection(Enchantments.BLAST_PROTECTION.getRarity(), Protection.Type.EXPLOSION, ARMOR_SLOTS));
    static RegistryObject<Enchantment> protectionprojectile = deferredRegister.register("projectile_protection", () -> new Protection(Enchantments.PROJECTILE_PROTECTION.getRarity(), Protection.Type.PROJECTILE, ARMOR_SLOTS));
    static RegistryObject<Enchantment> respiration = deferredRegister.register("respiration", () -> new Respiration(Enchantments.RESPIRATION.getRarity(), ARMOR_SLOTS));
    static RegistryObject<Enchantment> acquaaffinity = deferredRegister.register("aqua_affinity", () -> new AcquaAffinity(Enchantments.AQUA_AFFINITY.getRarity(), ARMOR_SLOTS));
    static RegistryObject<Enchantment> thorns = deferredRegister.register("thorns", () -> new Thorn(Enchantments.THORNS.getRarity(), ARMOR_SLOTS));
    static RegistryObject<Enchantment> depthstrider = deferredRegister.register("depth_strider", () -> new DepthStrider(Enchantments.DEPTH_STRIDER.getRarity(), ARMOR_SLOTS));
    static RegistryObject<Enchantment> frostwalker = deferredRegister.register("frost_walker", () -> new FrostWalker(Enchantments.FROST_WALKER.getRarity(), EquipmentSlot.FEET));
    static RegistryObject<Enchantment> soulspeed = deferredRegister.register("soul_speed", () -> new SoulSpeed(Enchantments.SOUL_SPEED.getRarity(), EquipmentSlot.FEET));
    static RegistryObject<Enchantment> sharpness = deferredRegister.register("sharpness", () -> new Sharpness(Enchantments.SHARPNESS.getRarity(), 0, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> smite = deferredRegister.register("smite", () -> new Sharpness(Enchantments.SMITE.getRarity(), 1, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> baneofarthropods = deferredRegister.register("bane_of_arthropods", () -> new Sharpness(Enchantments.BANE_OF_ARTHROPODS.getRarity(), 2, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> knockback = deferredRegister.register("knockback", () -> new Knockback(Enchantments.KNOCKBACK.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> fireaspect = deferredRegister.register("fire_aspect", () -> new FireAspect(Enchantments.FIRE_ASPECT.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> looting = deferredRegister.register("looting", () -> new Looting(Enchantments.MOB_LOOTING.getRarity(), EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> sweeping = deferredRegister.register("sweeping", () -> new Sweeping(Enchantments.SWEEPING_EDGE.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> unbreaking = deferredRegister.register("unbreaking", () -> new Unbreaking(Enchantments.UNBREAKING.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> fortune = deferredRegister.register("fortune", () -> new Fortune(Enchantments.BLOCK_FORTUNE.getRarity(), EnchantmentCategory.DIGGER, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> power = deferredRegister.register("power", () -> new Power(Enchantments.POWER_ARROWS.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> punch = deferredRegister.register("punch", () -> new Punch(Enchantments.PUNCH_ARROWS.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> luckofsea = deferredRegister.register("luck_of_the_sea", () -> new Fortune(Enchantments.FISHING_LUCK.getRarity(), EnchantmentCategory.FISHING_ROD, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> lure = deferredRegister.register("lure", () -> new Lure(Enchantments.FISHING_SPEED.getRarity(), EnchantmentCategory.FISHING_ROD, EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> loyalty = deferredRegister.register("loyalty", () -> new Loyalty(Enchantments.LOYALTY.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> impaling = deferredRegister.register("impaling", () -> new Impaling(Enchantments.IMPALING.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> riptide = deferredRegister.register("riptide", () -> new Riptide(Enchantments.RIPTIDE.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> channeling = deferredRegister.register("channeling", () -> new Channeling(Enchantments.CHANNELING.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> multishot = deferredRegister.register("multishot", () -> new Multishot(Enchantments.MULTISHOT.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> piercing = deferredRegister.register("piercing", () -> new Piercing(Enchantments.PIERCING.getRarity(), EquipmentSlot.MAINHAND));
    static RegistryObject<Enchantment> quickcharge = deferredRegister.register("quick_charge", () -> new QuickCharge(Enchantments.QUICK_CHARGE.getRarity(), EquipmentSlot.MAINHAND));

    public static void init() {
        deferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
