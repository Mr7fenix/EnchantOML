package me.Mr7fenix.enchantoml;




;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static ForgeConfigSpec.IntValue maxEnchantLevel;
    public static ForgeConfigSpec.IntValue acquaAffinity;
    public static ForgeConfigSpec.IntValue blastProtection;
    public static ForgeConfigSpec.IntValue fireProtection;
    public static ForgeConfigSpec.IntValue featherFalling;
    public static ForgeConfigSpec.IntValue respiration;
    public static ForgeConfigSpec.IntValue depthStrider;
    public static ForgeConfigSpec.IntValue thorns;
    public static ForgeConfigSpec.IntValue sharpness;
    public static ForgeConfigSpec.IntValue smite;
    public static ForgeConfigSpec.IntValue baneOfArthropods;
    public static ForgeConfigSpec.IntValue knockback;
    public static ForgeConfigSpec.IntValue fireAspect;
    public static ForgeConfigSpec.IntValue looting;
    public static ForgeConfigSpec.IntValue efficiency;
    public static ForgeConfigSpec.IntValue silkTouch;
    public static ForgeConfigSpec.IntValue unbreaking;
    public static ForgeConfigSpec.IntValue fortune;
    public static ForgeConfigSpec.IntValue power;
    public static ForgeConfigSpec.IntValue punch;
    public static ForgeConfigSpec.IntValue flame;
    public static ForgeConfigSpec.IntValue infinity;
    public static ForgeConfigSpec.IntValue luckOfTheSea;
    public static ForgeConfigSpec.IntValue lure;
    public static ForgeConfigSpec.IntValue mending;
    public static ForgeConfigSpec.IntValue channeling;
    public static ForgeConfigSpec.IntValue frostWalker;
    public static ForgeConfigSpec.IntValue impaling;
    public static ForgeConfigSpec.IntValue multishot;
    public static ForgeConfigSpec.IntValue piercing;
    public static ForgeConfigSpec.IntValue quickcharge;
    public static ForgeConfigSpec.IntValue riptide;
    public static ForgeConfigSpec.IntValue soulspeed;
    public static ForgeConfigSpec.IntValue sweeping;


    public static void registy(ForgeConfigSpec.Builder builder) {
        builder.comment("Enchant OML config").push("enchantoml");

        maxEnchantLevel = builder
                .comment("Maximum enchant level for all enchantments")
                .defineInRange("Max level for all enchantment", 10, 1, 255);


        builder.comment("Max level for single enchantments");

        acquaAffinity = builder
                .defineInRange("AquaAffinity", 0, 1, 255);

        blastProtection = builder
                .defineInRange("BlastProtection", 0, 1, 255);


        fireProtection = builder
                .defineInRange("FireProtection", 0, 1, 255);

        featherFalling = builder
                .defineInRange("FeatherFalling", 0, 1, 255);

        respiration = builder
                .defineInRange("Respiration", 0, 1, 255);

        depthStrider = builder
                .defineInRange("DepthStrider", 0, 1, 255);

        thorns = builder
                .defineInRange("Thorns", 0, 1, 255);


        sharpness = builder
                .defineInRange("Sharpness", 0, 1, 255);


        smite = builder
                .defineInRange("Smite", 0, 1, 255);


        baneOfArthropods = builder
                .defineInRange("BaneOfArthropods", 0, 1, 255);


        knockback = builder
                .defineInRange("Knockback", 0, 1, 255);


        fireAspect = builder
                .defineInRange("FireAspect", 0, 1, 255);


        looting = builder
                .defineInRange("Looting", 0, 1, 255);


        efficiency = builder
                .defineInRange("Efficiency", 0, 1, 255);


        unbreaking = builder
                .defineInRange("Unbreaking", 0, 1, 255);


        fortune = builder
                .defineInRange("Fortune", 0, 1, 255);


        power = builder
                .defineInRange("Power", 0, 1, 255);


        flame = builder
                .defineInRange("Flame", 0, 1, 255);


        infinity = builder
                .defineInRange("Infinity", 0, 1, 255);


        punch = builder
                .defineInRange("Punch", 0, 1, 255);


        luckOfTheSea = builder
                .defineInRange("LuckOfTheSea", 0, 1, 255);


        lure = builder
                .defineInRange("Lure", 0, 1, 255);


        mending = builder
                .defineInRange("Mending", 0, 1, 255);


        silkTouch = builder
                .defineInRange("SilkTouch", 0, 1, 255);

        channeling = builder
                .defineInRange("Channeling", 0, 1, 255);

        frostWalker = builder
                .defineInRange("FrostWalker", 0, 1, 255);

        impaling = builder
                .defineInRange("Impaling", 0, 1, 255);

        multishot = builder
                .defineInRange("MultiShot", 0, 1, 255);

        piercing = builder
                .defineInRange("Piercing", 0, 1, 255);

        quickcharge = builder
                .defineInRange("QuickCharge", 0, 1, 255);

        riptide = builder
                .defineInRange("Riptide", 0, 1, 255);

        soulspeed = builder
                .defineInRange("SoulSpeed", 0, 1, 255);

        sweeping = builder
                .defineInRange("Sweeping", 0, 1, 255);


        builder.pop();
    }
}
