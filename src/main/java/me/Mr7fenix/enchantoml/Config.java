package me.Mr7fenix.enchantoml;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static ForgeConfigSpec.IntValue maxEnchantLevel;

    public static void registy(ForgeConfigSpec.Builder builder) {
        builder.comment("Enchant OML config").push("enchantoml");
        maxEnchantLevel = builder
                .comment("Maximum enchant level for all enchantments")
                .defineInRange("maxEnchantLevel", 10, 1, 255);
        builder.pop();
    }
}
