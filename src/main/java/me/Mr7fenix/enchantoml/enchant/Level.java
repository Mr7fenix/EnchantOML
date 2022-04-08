package me.Mr7fenix.enchantoml.enchant;

import me.Mr7fenix.enchantoml.Config;

public class Level {
    public static int getLevel(int enchant) {
        if (enchant != 0) {
            return enchant;

        } else {
            return Config.maxEnchantLevel.get();

        }
    }
}
