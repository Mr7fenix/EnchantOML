package me.Mr7fenix.enchantoml;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigRegistry {
    public static void register(){
        registerClientConfig();
        registerCommonConfig();
        registerServerConfig();
    }

    private static void registerClientConfig() {
        ForgeConfigSpec.Builder builderClient = new ForgeConfigSpec.Builder();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, builderClient.build());
    }

    private static void registerCommonConfig() {
        ForgeConfigSpec.Builder builderCommon = new ForgeConfigSpec.Builder();
        Config.registy(builderCommon);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, builderCommon.build());

    }

    private static void registerServerConfig() {
        ForgeConfigSpec.Builder builderServer = new ForgeConfigSpec.Builder();
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, builderServer.build());
    }
}
