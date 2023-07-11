package me.flugel.mcsplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class MCSPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
